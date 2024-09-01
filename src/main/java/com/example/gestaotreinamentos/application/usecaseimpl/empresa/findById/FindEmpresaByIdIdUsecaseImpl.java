package com.example.gestaotreinamentos.application.usecaseimpl.empresa.findById;

import com.example.gestaotreinamentos.application.gateway.empresa.EmpresaGateway;
import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.usecase.empresa.findById.FindEmpresaByIdUsecase;

public class FindEmpresaByIdIdUsecaseImpl implements FindEmpresaByIdUsecase {

    private final EmpresaGateway empresaGateway;

    public FindEmpresaByIdIdUsecaseImpl(EmpresaGateway empresaGateway) {
        this.empresaGateway = empresaGateway;
    }

    @Override
    public Empresa execute(Long empresaId) {
        return empresaGateway.findById(empresaId);
    }
}
