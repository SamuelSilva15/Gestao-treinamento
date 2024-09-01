package com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.findById;

import com.example.gestaotreinamentos.application.gateway.centrocusto.CentroCustoGateway;
import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.usecase.centrocusto.findById.FindCentroCustoByIdUsecase;

public class FindCentroCustoByIdUsecaseImpl implements FindCentroCustoByIdUsecase {

    private final CentroCustoGateway centroCustoGateway;

    public FindCentroCustoByIdUsecaseImpl(CentroCustoGateway centroCustoGateway) {
        this.centroCustoGateway = centroCustoGateway;
    }

    @Override
    public CentroCusto execute(Long centroCustoId) {
        return centroCustoGateway.findById(centroCustoId);
    }
}