package com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.findAll;

import com.example.gestaotreinamentos.application.gateway.centrocusto.CentroCustoGateway;
import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.usecase.centrocusto.findAll.FindAllCentroCustosUsecase;

import java.util.List;

public class FindAllCentroCustosUsecaseImpl implements FindAllCentroCustosUsecase {

    private final CentroCustoGateway centroCustoGateway;

    public FindAllCentroCustosUsecaseImpl(CentroCustoGateway centroCustoGateway) {
        this.centroCustoGateway = centroCustoGateway;
    }

    @Override
    public List<CentroCusto> execute() {
        return centroCustoGateway.findAll();
    }
}
