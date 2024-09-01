package com.example.gestaotreinamentos.infra.controller;

import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.usecase.setor.deleteById.DeleteSetorByIdUsecase;
import com.example.gestaotreinamentos.usecase.setor.findAll.FindAllSetoresUsecase;
import com.example.gestaotreinamentos.usecase.setor.findById.FindSetorByUsecase;
import com.example.gestaotreinamentos.usecase.setor.save.SaveSetorUsecase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/setor")
public class SetorController {

    private final FindAllSetoresUsecase findAllSetoresUsecase;
    private final FindSetorByUsecase findSetorByUsecase;
    private final SaveSetorUsecase saveSetorUsecase;
    private final DeleteSetorByIdUsecase deleteSetorByIdUsecase;

    public SetorController(FindAllSetoresUsecase findAllSetoresUsecase, FindSetorByUsecase findSetorByUsecase, SaveSetorUsecase saveSetorUsecase, DeleteSetorByIdUsecase deleteSetorByIdUsecase) {
        this.findAllSetoresUsecase = findAllSetoresUsecase;
        this.findSetorByUsecase = findSetorByUsecase;
        this.saveSetorUsecase = saveSetorUsecase;
        this.deleteSetorByIdUsecase = deleteSetorByIdUsecase;
    }

    @GetMapping
    public List<Setor> findAll() {
        return findAllSetoresUsecase.execute();
    }

    @GetMapping("/{setorId}")
    public Setor findById(@PathVariable("setorId") Long setorId) {
        return findSetorByUsecase.execute(setorId);
    }

    @PostMapping
    public Setor save(@RequestBody Setor setor) {
        return saveSetorUsecase.execute(setor);
    }

    @DeleteMapping("/{setorId}")
    public void deleteById(@PathVariable("setorId") Long setorId) {
        deleteSetorByIdUsecase.execute(setorId);
    }
}
