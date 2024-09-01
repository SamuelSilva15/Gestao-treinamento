package com.example.gestaotreinamentos.application.usecaseimpl.funcao.findById;

import com.example.gestaotreinamentos.application.gateway.funcao.FuncaoGateway;
import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.usecase.funcao.findById.FindFuncaoByIdUsecase;

public class FindFuncaoByIdUsecaseImpl implements FindFuncaoByIdUsecase {

    private final FuncaoGateway funcaoGateway;

    public FindFuncaoByIdUsecaseImpl(FuncaoGateway funcaoGateway) {
        this.funcaoGateway = funcaoGateway;
    }

    @Override
    public Funcao execute(Long funcaoId) {
        return funcaoGateway.findById(funcaoId);
    }
}
