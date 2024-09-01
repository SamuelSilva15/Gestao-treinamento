package com.example.gestaotreinamentos.application.usecaseimpl.setor.save;

import com.example.gestaotreinamentos.application.gateway.setor.SetorGateway;
import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.usecase.setor.save.SaveSetorUsecase;

public class SaveSetorUsecaseImpl implements SaveSetorUsecase {

    private final SetorGateway setorGateway;

    public SaveSetorUsecaseImpl(SetorGateway setorGateway) {
        this.setorGateway = setorGateway;
    }

    @Override
    public Setor execute(Setor setor) {
        return setorGateway.saveSetorEntity(setor);
    }
}
