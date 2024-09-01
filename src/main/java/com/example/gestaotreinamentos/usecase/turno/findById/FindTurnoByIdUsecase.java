package com.example.gestaotreinamentos.usecase.turno.findById;

import com.example.gestaotreinamentos.core.domain.turno.Turno;

public interface FindTurnoByIdUsecase {
    Turno execute(Long turnoId);
}
