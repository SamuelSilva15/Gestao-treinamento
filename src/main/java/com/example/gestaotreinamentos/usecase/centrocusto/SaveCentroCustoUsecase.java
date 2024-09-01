package com.example.gestaotreinamentos.usecase.centrocusto;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;

public interface SaveCentroCustoUsecase {

    CentroCustoEntity execute(CentroCusto centroCusto);
}
