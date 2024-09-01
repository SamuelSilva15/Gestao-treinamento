package com.example.gestaotreinamentos.application.usecaseimpl.funcionario.deleteById;

import com.example.gestaotreinamentos.application.gateway.funcionario.FuncionarioGateway;
import com.example.gestaotreinamentos.usecase.funcionario.deleteById.DeleteFuncionarioByIdUsecase;

public class DeleteFuncionarioByIdUsecaseImpl implements DeleteFuncionarioByIdUsecase {

    private final FuncionarioGateway funcionarioGateway;

    public DeleteFuncionarioByIdUsecaseImpl(FuncionarioGateway funcionarioGateway) {
        this.funcionarioGateway = funcionarioGateway;
    }

    @Override
    public void execute(Long funcionarioId) {
        funcionarioGateway.deleteById(funcionarioId);
    }
}
