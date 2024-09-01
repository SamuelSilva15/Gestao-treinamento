package com.example.gestaotreinamentos.core.exception.empresa;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmpresaNotFoundException extends RuntimeException {
    public EmpresaNotFoundException(Long empresaId) {
        super("Emresa não encontrada: " + empresaId);
    }
}
