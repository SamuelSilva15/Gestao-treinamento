package com.example.gestaotreinamentos.application.usecaseimpl.unidade.saveUnidade;

import com.example.gestaotreinamentos.application.gateway.unidade.UnidadeGateway;
import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.usecase.unidade.saveUnidade.SaveUnidadeUseCase;

public class SaveUnidadeUsecaseImpl implements SaveUnidadeUseCase {

    private final UnidadeGateway unidadeGateway;

    public SaveUnidadeUsecaseImpl(UnidadeGateway unidadeGateway) {
        this.unidadeGateway = unidadeGateway;
    }

    @Override
    public Unidade execute(Unidade unidade) {
        return unidadeGateway.saveUnidade(unidade);
    }
}
