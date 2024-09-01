package com.example.gestaotreinamentos.infra.mapper.turno;

import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.infra.entity.turno.TurnoEntity;
import org.springframework.stereotype.Component;

@Component
public class TurnoMapper {

    public TurnoEntity toTurnoEntity(Turno turno) {
        return new TurnoEntity(turno.id(), turno.turno());
    }

    public Turno toTurno(TurnoEntity turnoEntity) {
        return new Turno(turnoEntity.getId(), turnoEntity.getTurno());
    }
}
