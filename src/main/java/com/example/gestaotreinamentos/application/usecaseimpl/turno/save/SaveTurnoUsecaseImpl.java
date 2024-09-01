package com.example.gestaotreinamentos.application.usecaseimpl.turno.save;

import com.example.gestaotreinamentos.application.gateway.turno.TurnoGateway;
import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.usecase.setor.save.SaveTurnoUsecase;

public class SaveTurnoUsecaseImpl implements SaveTurnoUsecase {

    private final TurnoGateway turnoGateway;

    public SaveTurnoUsecaseImpl(TurnoGateway turnoGateway) {
        this.turnoGateway = turnoGateway;
    }

    @Override
    public Turno execute(Turno turno) {
        return turnoGateway.save(turno);
    }
}
