package com.example.gestaotreinamentos.infra.service.setor;

import com.example.gestaotreinamentos.application.gateway.setor.SetorGateway;
import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.core.exception.setor.SetorNotFoundException;
import com.example.gestaotreinamentos.infra.entity.setor.SetorEntity;
import com.example.gestaotreinamentos.infra.mapper.setor.SetorMapper;
import com.example.gestaotreinamentos.infra.repository.setor.SetorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SetorGatewayImpl implements SetorGateway {

    private final SetorRepository setorRepository;
    private final SetorMapper setorMapper;

    public SetorGatewayImpl(SetorRepository setorRepository, SetorMapper setorMapper) {
        this.setorRepository = setorRepository;
        this.setorMapper = setorMapper;
    }

    @Override
    public Setor saveSetorEntity(Setor setor) {
        SetorEntity setorEntity = setorMapper.toSetorEntity(setor);
        setorRepository.save(setorEntity);
        return setor;
    }

    @Override
    public List<Setor> findAll() {
        List<SetorEntity> setorEntityList = setorRepository.findAll();
        List<Setor> setorList = new ArrayList<>(setorEntityList.size());
        setorEntityList.forEach(setorEntity -> {
            Setor setor = setorMapper.toSetor(setorEntity);
            setorList.add(setor);
        });

        return setorList;
    }

    @Override
    public Setor findById(Long setorId) {
        SetorEntity setorEntity = setorRepository.findById(setorId).orElseThrow(() -> new SetorNotFoundException(setorId));
        return setorMapper.toSetor(setorEntity);
    }

    @Override
    public void deleteById(Long setorId) {
        SetorEntity setorEntity = setorRepository.findById(setorId).orElseThrow(() -> new SetorNotFoundException(setorId));
        setorRepository.delete(setorEntity);
    }
}
