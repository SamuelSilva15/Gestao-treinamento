package com.example.gestaotreinamentos.infra.mapper;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import org.springframework.stereotype.Component;

@Component
public class CentroCustoMapper {

    public CentroCustoEntity toCentroCustoEntity(CentroCusto centroCusto) {
        return new CentroCustoEntity(centroCusto.id(), centroCusto.nome());
    }

    public CentroCusto toCentroCusto(CentroCustoEntity centroCustoEntity) {
        return new CentroCusto(centroCustoEntity.getId(), centroCustoEntity.getNome());
    }
}
