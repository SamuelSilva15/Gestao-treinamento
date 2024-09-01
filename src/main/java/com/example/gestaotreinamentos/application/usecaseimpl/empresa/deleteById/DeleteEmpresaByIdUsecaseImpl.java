package com.example.gestaotreinamentos.application.usecaseimpl.empresa.deleteById;

import com.example.gestaotreinamentos.application.gateway.empresa.EmpresaGateway;
import com.example.gestaotreinamentos.usecase.empresa.deleteById.DeleteEmpresaByIdUsecase;

public class DeleteEmpresaByIdUsecaseImpl implements DeleteEmpresaByIdUsecase {

    private final EmpresaGateway empresaGateway;

    public DeleteEmpresaByIdUsecaseImpl(EmpresaGateway empresaGateway) {
        this.empresaGateway = empresaGateway;
    }

    public void execute(Long empresaId) {
        empresaGateway.deleteById(empresaId);
    }
}
