package com.example.gestaotreinamentos.usecase.setor.findById;

import com.example.gestaotreinamentos.core.domain.setor.Setor;

public interface FindSetorByUsecase {

    Setor execute(Long setorId);
}
