package com.example.gestaotreinamentos.core.exception.funcao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FuncaoNotFoundException extends RuntimeException {
    public FuncaoNotFoundException(Long funcaoId) {
        super("Função não encontrada:" + funcaoId);
    }
}
