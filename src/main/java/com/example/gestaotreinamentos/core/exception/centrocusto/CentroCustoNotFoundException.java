package com.example.gestaotreinamentos.core.exception.centrocusto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CentroCustoNotFoundException extends RuntimeException {
    public CentroCustoNotFoundException(Long centroCustoId) {
        super("Centro de custo não encontrado: " + centroCustoId);
    }
}
