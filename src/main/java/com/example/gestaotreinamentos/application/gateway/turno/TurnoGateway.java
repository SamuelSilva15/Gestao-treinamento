package com.example.gestaotreinamentos.application.gateway.turno;

import com.example.gestaotreinamentos.core.domain.turno.Turno;

import java.util.List;

public interface TurnoGateway {
    List<Turno> findAll();
    Turno findById(Long turnoId);
    Turno save(Turno turno);
    void deleteById(Long turnoId);
}
