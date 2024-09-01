package com.example.gestaotreinamentos.core.exception.funcionario;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FuncionarioNotFoundException extends RuntimeException {
    public FuncionarioNotFoundException(Long funcionarioId) {
        super("Funcionário não encontrado: " + funcionarioId);
    }
}
