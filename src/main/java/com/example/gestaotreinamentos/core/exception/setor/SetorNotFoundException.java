package com.example.gestaotreinamentos.core.exception.setor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SetorNotFoundException extends RuntimeException {
    public SetorNotFoundException(Long setorId) {
        super("Setor não encontrado: " + setorId);
    }
}
