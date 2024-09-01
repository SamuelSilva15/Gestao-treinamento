package com.example.gestaotreinamentos.application.usecaseimpl.funcao.save;

import com.example.gestaotreinamentos.application.gateway.funcao.FuncaoGateway;
import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.usecase.funcao.save.SaveFuncaoUsecase;

public class SaveFuncaoUsecaseImpl implements SaveFuncaoUsecase {

    private final FuncaoGateway funcaoGateway;

    public SaveFuncaoUsecaseImpl(FuncaoGateway funcaoGateway) {
        this.funcaoGateway = funcaoGateway;
    }

    @Override
    public Funcao execute(Funcao funcao) {
        return funcaoGateway.save(funcao);
    }
}
