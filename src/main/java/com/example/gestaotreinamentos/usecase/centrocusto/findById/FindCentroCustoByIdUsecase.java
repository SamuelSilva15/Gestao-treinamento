package com.example.gestaotreinamentos.usecase.centrocusto.findById;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;

public interface FindCentroCustoByIdUsecase {
    CentroCusto execute(Long centroCustoId);
}
