package com.example.gestaotreinamentos.core.exception.turno;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TurnoNotFoundException extends RuntimeException {
    public TurnoNotFoundException(Long turnoId) {
        super("Turno não encontrado: " + turnoId);
    }
}
