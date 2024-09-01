package com.example.gestaotreinamentos.infra.service.centrocusto;

import com.example.gestaotreinamentos.application.gateway.centrocusto.CentroCustoGateway;
import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.core.exception.centrocusto.CentroCustoNotFoundException;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.infra.mapper.CentroCustoMapper;
import com.example.gestaotreinamentos.infra.repository.centrocusto.CentroCustoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CentroCustoGatewayImpl implements CentroCustoGateway {

    private final CentroCustoRepository centroCustoRepository;
    private final CentroCustoMapper centroCustoMapper;

    public CentroCustoGatewayImpl(CentroCustoRepository centroCustoRepository, CentroCustoMapper centroCustoMapper) {
        this.centroCustoRepository = centroCustoRepository;
        this.centroCustoMapper = centroCustoMapper;
    }

    @Override
    public CentroCustoEntity save(CentroCusto centroCusto) {
        CentroCustoEntity centroCustoEntity = centroCustoMapper.toCentroCustoEntity(centroCusto);
        return centroCustoRepository.save(centroCustoEntity);
    }

    @Override
    public List<CentroCusto> findAll() {
        List<CentroCustoEntity> centroCustoEntities  = centroCustoRepository.findAll();
        List<CentroCusto> centroCustoList = new ArrayList<>(centroCustoEntities.size());
        centroCustoEntities.forEach(centroCustoEntity -> {
            CentroCusto centroCusto = centroCustoMapper.toCentroCusto(centroCustoEntity);
            centroCustoList.add(centroCusto);
        });

        return centroCustoList;
    }

    @Override
    public CentroCusto findById(Long centroCustoId) {
        CentroCustoEntity centroCustoEntity = centroCustoRepository.findById(centroCustoId).orElseThrow(() -> new CentroCustoNotFoundException(centroCustoId));
        return centroCustoMapper.toCentroCusto(centroCustoEntity);
    }

    @Override
    public void deleteById(Long centroCustoId) {
        CentroCustoEntity centroCustoEntity = centroCustoRepository.findById(centroCustoId).orElseThrow(() -> new CentroCustoNotFoundException(centroCustoId));
        centroCustoRepository.delete(centroCustoEntity);
    }
}