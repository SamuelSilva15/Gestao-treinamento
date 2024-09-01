package com.example.gestaotreinamentos.usecase.turno.save;

import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.infra.entity.turno.TurnoEntity;

public interface SaveTurnoUsecase {
    TurnoEntity execute(Turno turno);
}
