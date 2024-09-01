package com.example.gestaotreinamentos.application.usecaseimpl.setor.findById;

import com.example.gestaotreinamentos.application.gateway.setor.SetorGateway;
import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.usecase.setor.findById.FindSetorByUsecase;

public class FindSetorByUsecaseImpl implements FindSetorByUsecase {

    private final SetorGateway setorGateway;

    public FindSetorByUsecaseImpl(SetorGateway setorGateway) {
        this.setorGateway = setorGateway;
    }

    @Override
    public Setor execute(Long setorId) {
        return setorGateway.findById(setorId);
    }
}
