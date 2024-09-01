package com.example.gestaotreinamentos.infra.service.unidade;

import com.example.gestaotreinamentos.application.gateway.unidade.UnidadeGateway;
import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.core.exception.unidade.UnidadeNotFoundException;
import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;
import com.example.gestaotreinamentos.infra.mapper.unidade.UnidadeMapper;
import com.example.gestaotreinamentos.infra.repository.unidade.UnidadeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnidadeGatewayImpl implements UnidadeGateway {

    private final UnidadeRepository unidadeRepository;
    private final UnidadeMapper unidadeMapper;

    public UnidadeGatewayImpl(UnidadeRepository unidadeRepository, UnidadeMapper unidadeMapper) {
        this.unidadeRepository = unidadeRepository;
        this.unidadeMapper = unidadeMapper;
    }

    @Override
    public Unidade saveUnidade(Unidade unidade) {
        UnidadeEntity unidadeEntity = unidadeMapper.toUnidadeEntity(unidade);
        unidadeRepository.save(unidadeEntity);
        return unidade;
    }

    @Override
    public void deleteById(Long unidadeId) {
        UnidadeEntity unidadeEntity = unidadeRepository.findById(unidadeId).orElseThrow(() -> new UnidadeNotFoundException(unidadeId));
        unidadeRepository.delete(unidadeEntity);
    }

    @Override
    public List<Unidade> findAll() {
        List<UnidadeEntity> unidadeEntityList = unidadeRepository.findAll();
        List<Unidade> unidadeList = new ArrayList<>(unidadeEntityList.size());
        unidadeEntityList.forEach(unidadeEntity -> {
            Unidade unidade = unidadeMapper.toUnidade(unidadeEntity);
            unidadeList.add(unidade);
        });

        return unidadeList;
    }

    @Override
    public Unidade findUnidadeById(Long unidadeId) {
        UnidadeEntity unidadeEntity = unidadeRepository.findById(unidadeId).orElseThrow(() -> new UnidadeNotFoundException(unidadeId));
        return unidadeMapper.toUnidade(unidadeEntity);
    }
}
