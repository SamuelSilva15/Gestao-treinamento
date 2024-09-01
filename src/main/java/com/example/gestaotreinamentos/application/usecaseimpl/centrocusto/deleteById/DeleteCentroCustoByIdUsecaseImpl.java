package com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.deleteById;

import com.example.gestaotreinamentos.application.gateway.centrocusto.CentroCustoGateway;
import com.example.gestaotreinamentos.usecase.centrocusto.deleteById.DeleteCentroCustoByIdUsecase;

public class DeleteCentroCustoByIdUsecaseImpl implements DeleteCentroCustoByIdUsecase {

    private final CentroCustoGateway centroCustoGateway;

    public DeleteCentroCustoByIdUsecaseImpl(CentroCustoGateway centroCustoGateway) {
        this.centroCustoGateway = centroCustoGateway;
    }

    @Override
    public void execute(Long centroCustoId) {
        centroCustoGateway.deleteById(centroCustoId);
    }
}
