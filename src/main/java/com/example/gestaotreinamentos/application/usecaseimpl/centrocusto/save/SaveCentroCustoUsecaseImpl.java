package com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.save;

import com.example.gestaotreinamentos.application.gateway.centrocusto.CentroCustoGateway;
import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.usecase.centrocusto.SaveCentroCustoUsecase;

public class SaveCentroCustoUsecaseImpl implements SaveCentroCustoUsecase {

    private final CentroCustoGateway centroCustoGateway;

    public SaveCentroCustoUsecaseImpl(CentroCustoGateway centroCustoGateway) {
        this.centroCustoGateway = centroCustoGateway;
    }

    @Override
    public CentroCustoEntity execute(CentroCusto centroCusto) {
        return centroCustoGateway.save(centroCusto);
    }
}
