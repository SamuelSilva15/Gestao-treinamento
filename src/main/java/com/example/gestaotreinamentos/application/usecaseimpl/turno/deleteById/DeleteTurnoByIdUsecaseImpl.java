package com.example.gestaotreinamentos.application.usecaseimpl.turno.deleteById;

import com.example.gestaotreinamentos.application.gateway.turno.TurnoGateway;
import com.example.gestaotreinamentos.usecase.turno.deleteById.DeleteTurnoByIdUsecase;

public class DeleteTurnoByIdUsecaseImpl implements DeleteTurnoByIdUsecase {

    private final TurnoGateway turnoGateway;

    public DeleteTurnoByIdUsecaseImpl(TurnoGateway turnoGateway) {
        this.turnoGateway = turnoGateway;
    }

    @Override
    public void execute(Long turnoId) {
        turnoGateway.deleteById(turnoId);
    }
}
