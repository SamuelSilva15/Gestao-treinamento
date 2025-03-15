package com.example.gestaotreinamentos.usecase.centrocusto;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centrocusto.CentroCustoEntity;

public interface SaveCentroCustoUsecase {

    CentroCustoEntity execute(CentroCusto centroCusto);
}
