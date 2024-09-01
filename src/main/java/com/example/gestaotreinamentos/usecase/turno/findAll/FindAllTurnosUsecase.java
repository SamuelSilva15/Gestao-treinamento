package com.example.gestaotreinamentos.usecase.turno.findAll;

import com.example.gestaotreinamentos.core.domain.turno.Turno;

import java.util.List;

public interface FindAllTurnosUsecase {

    List<Turno> execute();
}
