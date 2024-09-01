package com.example.gestaotreinamentos.core.exception.unidade;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UnidadeNotFoundException extends RuntimeException {
    public UnidadeNotFoundException(Long unidadeId) {
        super("Unidade não encontrada: " + unidadeId);
    }
}
