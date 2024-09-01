package com.example.gestaotreinamentos.application.usecaseimpl.funcionario.findAll;

import com.example.gestaotreinamentos.application.gateway.funcionario.FuncionarioGateway;
import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;
import com.example.gestaotreinamentos.infra.entity.funcionario.FuncionarioEntity;
import com.example.gestaotreinamentos.usecase.funcionario.findAll.FindAllFuncionariosUsecase;

import java.util.List;

public class FindAllFuncionarioUsecaseImpl implements FindAllFuncionariosUsecase {

    private final FuncionarioGateway funcionarioGateway;

    public FindAllFuncionarioUsecaseImpl(FuncionarioGateway funcionarioGateway) {
        this.funcionarioGateway = funcionarioGateway;
    }

    @Override
    public List<Funcionario> execute() {
        return funcionarioGateway.findAll();
    }
}