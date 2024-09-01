package com.example.gestaotreinamentos.application.usecaseimpl.funcionario.save;

import com.example.gestaotreinamentos.application.gateway.funcionario.FuncionarioGateway;
import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;
import com.example.gestaotreinamentos.usecase.funcionario.save.SaveFuncionarioUsecase;

public class SaveFuncionarioUsecaseImpl implements SaveFuncionarioUsecase {

    private final FuncionarioGateway funcionarioGateway;

    public SaveFuncionarioUsecaseImpl(FuncionarioGateway funcionarioGateway) {
        this.funcionarioGateway = funcionarioGateway;
    }

    @Override
    public Funcionario execute(Funcionario funcionario) {
        return funcionarioGateway.save(funcionario);
    }
}