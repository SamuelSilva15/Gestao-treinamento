package com.example.gestaotreinamentos.application.usecaseimpl.empresa.findAll;

import com.example.gestaotreinamentos.application.gateway.empresa.EmpresaGateway;
import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.infra.entity.empresa.EmpresaEntity;
import com.example.gestaotreinamentos.usecase.empresa.findAll.FindAllEmpresasUsecase;

import java.util.List;

public class FindAllEmpresasUsecaseImpl implements FindAllEmpresasUsecase {

    private final EmpresaGateway empresaGateway;

    public FindAllEmpresasUsecaseImpl(EmpresaGateway empresaGateway) {
        this.empresaGateway = empresaGateway;
    }

    @Override
    public List<Empresa> execute() {
        return empresaGateway.findAll();
    }
}