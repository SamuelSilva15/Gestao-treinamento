package com.example.gestaotreinamentos.application.usecaseimpl.unidade.findAll;

import com.example.gestaotreinamentos.application.gateway.unidade.UnidadeGateway;
import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.usecase.unidade.findAll.FindAllUnidadesUsecase;

import java.util.List;

public class FindAllUnidadesUsecaseImpl implements FindAllUnidadesUsecase {

    private final UnidadeGateway unidadeGateway;

    public FindAllUnidadesUsecaseImpl(UnidadeGateway unidadeGateway) {
        this.unidadeGateway = unidadeGateway;
    }

    public List<Unidade> execute() {
        return unidadeGateway.findAll();
    }
}
