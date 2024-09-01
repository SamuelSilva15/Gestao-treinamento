package com.example.gestaotreinamentos.application.usecaseimpl.setor.deleteById;

import com.example.gestaotreinamentos.application.gateway.setor.SetorGateway;
import com.example.gestaotreinamentos.usecase.setor.deleteById.DeleteSetorByIdUsecase;

public class DeleteSetorByIdUsecaseImpl implements DeleteSetorByIdUsecase {

    private final SetorGateway setorGateway;

    public DeleteSetorByIdUsecaseImpl(SetorGateway setorGateway) {
        this.setorGateway = setorGateway;
    }

    @Override
    public void execute(Long setorId) {
        setorGateway.deleteById(setorId);
    }
}
