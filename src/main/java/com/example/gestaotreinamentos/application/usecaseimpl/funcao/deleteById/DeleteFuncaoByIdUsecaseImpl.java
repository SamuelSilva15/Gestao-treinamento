package com.example.gestaotreinamentos.application.usecaseimpl.funcao.deleteById;

import com.example.gestaotreinamentos.application.gateway.funcao.FuncaoGateway;
import com.example.gestaotreinamentos.usecase.funcao.deleteById.DeleteFuncaoByIdUsecase;

public class DeleteFuncaoByIdUsecaseImpl implements DeleteFuncaoByIdUsecase {

    private final FuncaoGateway funcaoGateway;

    public DeleteFuncaoByIdUsecaseImpl(FuncaoGateway funcaoGateway) {
        this.funcaoGateway = funcaoGateway;
    }

    @Override
    public void execute(Long funcaoId) {
        funcaoGateway.deleteById(funcaoId);
    }
}
