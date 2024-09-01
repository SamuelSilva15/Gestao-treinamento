package com.example.gestaotreinamentos.application.usecaseimpl.unidade.findById;

import com.example.gestaotreinamentos.application.gateway.unidade.UnidadeGateway;
import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.usecase.unidade.findById.FindUnidadeByIdUsecase;

public class FindUnidadeByIdUsecaseImpl implements FindUnidadeByIdUsecase {

    private final UnidadeGateway unidadeGateway;

    public FindUnidadeByIdUsecaseImpl(UnidadeGateway unidadeGateway) {
        this.unidadeGateway = unidadeGateway;
    }

    @Override
    public Unidade execute(Long empresaId) {
        return unidadeGateway.findUnidadeById(empresaId);
    }
}
