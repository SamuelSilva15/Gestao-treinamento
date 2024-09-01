package com.example.gestaotreinamentos.usecase.unidade.saveUnidade;

import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;

public interface SaveUnidadeUseCase {
    Unidade execute(Unidade unidade);

}
