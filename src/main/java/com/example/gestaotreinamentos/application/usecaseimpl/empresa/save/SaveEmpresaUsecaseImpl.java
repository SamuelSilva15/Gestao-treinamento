package com.example.gestaotreinamentos.application.usecaseimpl.empresa.save;

import com.example.gestaotreinamentos.application.gateway.empresa.EmpresaGateway;
import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.usecase.empresa.save.SaveEmpresaUsecase;

public class SaveEmpresaUsecaseImpl implements SaveEmpresaUsecase {

    private final EmpresaGateway empresaGateway;

    public SaveEmpresaUsecaseImpl(EmpresaGateway empresaGateway) {
        this.empresaGateway = empresaGateway;
    }

    @Override
    public Empresa execute(Empresa empresa) {
        return empresaGateway.save(empresa);
    }
}
