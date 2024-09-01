package com.example.gestaotreinamentos.application.usecaseimpl.unidade.deleteById;

import com.example.gestaotreinamentos.application.gateway.unidade.UnidadeGateway;
import com.example.gestaotreinamentos.usecase.unidade.deleteById.DeleteUnidadeByIdUsecase;

public class DeleteUnidadeByIdUsecaseImpl implements DeleteUnidadeByIdUsecase {

    private final UnidadeGateway unidadeGateway;

    public DeleteUnidadeByIdUsecaseImpl(UnidadeGateway unidadeGateway) {
        this.unidadeGateway = unidadeGateway;
    }

    public void execute(Long unidadeId) {
        unidadeGateway.deleteById(unidadeId);
    }
}
