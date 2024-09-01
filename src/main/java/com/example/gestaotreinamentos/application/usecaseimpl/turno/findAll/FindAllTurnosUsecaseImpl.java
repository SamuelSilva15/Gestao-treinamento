package com.example.gestaotreinamentos.application.usecaseimpl.turno.findAll;

import com.example.gestaotreinamentos.application.gateway.turno.TurnoGateway;
import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.usecase.turno.findAll.FindAllTurnosUsecase;

import java.util.List;

public class FindAllTurnosUsecaseImpl implements FindAllTurnosUsecase {

    private final TurnoGateway turnoGateway;

    public FindAllTurnosUsecaseImpl(TurnoGateway turnoGateway) {
        this.turnoGateway = turnoGateway;
    }

    @Override
    public List<Turno> execute() {
        return turnoGateway.findAll();
    }
}
