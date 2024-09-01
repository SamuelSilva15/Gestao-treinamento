package com.example.gestaotreinamentos.application.usecaseimpl.turno.findById;

import com.example.gestaotreinamentos.application.gateway.turno.TurnoGateway;
import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.usecase.turno.findById.FindTurnoByIdUsecase;

public class FindTurnoByIdUsecaseImpl implements FindTurnoByIdUsecase {

    private final TurnoGateway turnoGateway;

    public FindTurnoByIdUsecaseImpl(TurnoGateway turnoGateway) {
        this.turnoGateway = turnoGateway;
    }

    @Override
    public Turno execute(Long turnoId) {
        return turnoGateway.findById(turnoId);
    }
}
