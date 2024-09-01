package com.example.gestaotreinamentos.usecase.centrocusto.findAll;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;

import java.util.List;

public interface FindAllCentroCustosUsecase {
    List<CentroCusto> execute();
}
