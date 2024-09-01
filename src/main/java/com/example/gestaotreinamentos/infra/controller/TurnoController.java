package com.example.gestaotreinamentos.infra.controller;

import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.usecase.setor.save.SaveTurnoUsecase;
import com.example.gestaotreinamentos.usecase.turno.deleteById.DeleteTurnoByIdUsecase;
import com.example.gestaotreinamentos.usecase.turno.findAll.FindAllTurnosUsecase;
import com.example.gestaotreinamentos.usecase.turno.findById.FindTurnoByIdUsecase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/turno")
public class TurnoController {

    private final FindAllTurnosUsecase findAllTurnosUsecase;
    private final FindTurnoByIdUsecase findTurnoByIdUsecase;
    private final SaveTurnoUsecase saveTurnoUsecase;
    private final DeleteTurnoByIdUsecase deleteTurnoByIdUsecase;

    public TurnoController(FindAllTurnosUsecase findAllTurnosUsecase, FindTurnoByIdUsecase findTurnoByIdUsecase, SaveTurnoUsecase saveTurnoUsecase, DeleteTurnoByIdUsecase deleteTurnoByIdUsecase) {
        this.findAllTurnosUsecase = findAllTurnosUsecase;
        this.findTurnoByIdUsecase = findTurnoByIdUsecase;
        this.saveTurnoUsecase = saveTurnoUsecase;
        this.deleteTurnoByIdUsecase = deleteTurnoByIdUsecase;
    }

    @GetMapping
    public List<Turno> findAll() {
        return findAllTurnosUsecase.execute();
    }

    @GetMapping("/{turnoId}")
    public Turno findById(@PathVariable("turnoId") Long turnoId) {
        return findTurnoByIdUsecase.execute(turnoId);
    }

    @PostMapping
    public Turno save(@RequestBody Turno turno) {
        return saveTurnoUsecase.execute(turno);
    }

    @DeleteMapping("/{turnoId}")
    public void deleteById(@PathVariable("turnoId") Long turnoId) {
        deleteTurnoByIdUsecase.execute(turnoId);
    }
}