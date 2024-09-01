package com.example.gestaotreinamentos.usecase.unidade.findById;

import com.example.gestaotreinamentos.core.domain.unidade.Unidade;

public interface FindUnidadeByIdUsecase {
    Unidade execute(Long empresaId);
}
