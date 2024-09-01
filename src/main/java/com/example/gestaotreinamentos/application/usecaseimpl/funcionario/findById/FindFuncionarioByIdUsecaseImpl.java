package com.example.gestaotreinamentos.application.usecaseimpl.funcionario.findById;

import com.example.gestaotreinamentos.application.gateway.funcionario.FuncionarioGateway;
import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;
import com.example.gestaotreinamentos.usecase.funcionario.findById.FindFuncionarioByUsecase;

public class FindFuncionarioByIdUsecaseImpl implements FindFuncionarioByUsecase {

    private final FuncionarioGateway funcionarioGateway;

    public FindFuncionarioByIdUsecaseImpl(FuncionarioGateway funcionarioGateway) {
        this.funcionarioGateway = funcionarioGateway;
    }

    @Override
    public Funcionario execute(Long funcionarioId) {
        return funcionarioGateway.findById(funcionarioId);
    }
}