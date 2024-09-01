package com.example.gestaotreinamentos.application.usecaseimpl.setor.findAll;

import com.example.gestaotreinamentos.application.gateway.setor.SetorGateway;
import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.usecase.setor.findAll.FindAllSetoresUsecase;

import java.util.List;

public class FindAllSetoresUsecaseImpl implements FindAllSetoresUsecase {

    private final SetorGateway setorGateway;

    public FindAllSetoresUsecaseImpl(SetorGateway setorGateway) {
        this.setorGateway = setorGateway;
    }

    @Override
    public List<Setor> execute() {
        return setorGateway.findAll();
    }
}
