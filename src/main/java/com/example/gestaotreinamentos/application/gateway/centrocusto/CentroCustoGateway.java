package com.example.gestaotreinamentos.application.gateway.centrocusto;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;

import java.util.List;

public interface CentroCustoGateway {
    CentroCustoEntity save(CentroCusto centroCusto);
    List<CentroCusto> findAll();
    CentroCusto findById(Long centroCustoId);
    void deleteById(Long centroCustoId);
}
