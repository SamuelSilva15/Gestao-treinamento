package com.example.gestaotreinamentos.infra.service.turno;

import com.example.gestaotreinamentos.application.gateway.turno.TurnoGateway;
import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.core.exception.turno.TurnoNotFoundException;
import com.example.gestaotreinamentos.infra.entity.turno.TurnoEntity;
import com.example.gestaotreinamentos.infra.mapper.turno.TurnoMapper;
import com.example.gestaotreinamentos.infra.repository.turno.TurnoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TurnoGatewayImpl implements TurnoGateway {

    private final TurnoRepository turnoRepository;
    private final TurnoMapper turnoMapper;

    public TurnoGatewayImpl(TurnoRepository turnoRepository, TurnoMapper turnoMapper) {
        this.turnoRepository = turnoRepository;
        this.turnoMapper = turnoMapper;
    }

    @Override
    public List<Turno> findAll() {
        List<TurnoEntity> turnoEntityList = turnoRepository.findAll();
        List<Turno> turnoList = new ArrayList<>(turnoEntityList.size());
        turnoEntityList.forEach(turnoEntity -> {
            Turno turno = turnoMapper.toTurno(turnoEntity);
            turnoList.add(turno);
        });

        return turnoList;
    }

    @Override
    public Turno findById(Long turnoId) {
        TurnoEntity turnoEntity = turnoRepository.findById(turnoId).orElseThrow(() -> new TurnoNotFoundException(turnoId));
        return turnoMapper.toTurno(turnoEntity);
    }

    @Override
    public Turno save(Turno turno) {
        TurnoEntity turnoEntity = turnoMapper.toTurnoEntity(turno);
        turnoRepository.save(turnoEntity);
        return turno;
    }

    @Override
    public void deleteById(Long turnoId) {
        TurnoEntity turnoEntity = turnoRepository.findById(turnoId).orElseThrow(() -> new TurnoNotFoundException(turnoId));
        turnoRepository.delete(turnoEntity);
    }
}