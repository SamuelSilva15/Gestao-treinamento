package com.example.gestaotreinamentos.application.usecaseimpl.funcao.findAll;

import com.example.gestaotreinamentos.application.gateway.funcao.FuncaoGateway;
import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.usecase.funcao.findAll.FindAllFuncoesUsecase;

import java.util.List;

public class FindAllFuncoesUsecaseImpl implements FindAllFuncoesUsecase {

    private final FuncaoGateway funcaoGateway;

    public FindAllFuncoesUsecaseImpl(FuncaoGateway funcaoGateway) {
        this.funcaoGateway = funcaoGateway;
    }

    @Override
    public List<Funcao> execute() {
        return funcaoGateway.findAll();
    }
}