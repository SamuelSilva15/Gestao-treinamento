package com.example.gestaotreinamentos.usecase.funcao.findById;

import com.example.gestaotreinamentos.core.domain.funcao.Funcao;

public interface FindFuncaoByIdUsecase {
    Funcao execute(Long funcaoId);
}
