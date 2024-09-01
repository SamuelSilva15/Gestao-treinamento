package com.example.gestaotreinamentos.infra.controller;

import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;
import com.example.gestaotreinamentos.usecase.unidade.deleteById.DeleteUnidadeByIdUsecase;
import com.example.gestaotreinamentos.usecase.unidade.findAll.FindAllUnidadesUsecase;
import com.example.gestaotreinamentos.usecase.unidade.findById.FindUnidadeByIdUsecase;
import com.example.gestaotreinamentos.usecase.unidade.saveUnidade.SaveUnidadeUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/unidade")
public class UnidadeController {

    private final FindAllUnidadesUsecase findAllUnidadesUsecase;
    private final FindUnidadeByIdUsecase findUnidadeByIdUsecase;
    private final SaveUnidadeUseCase saveUnidadeUseCase;
    private final DeleteUnidadeByIdUsecase deleteUnidadeByIdUsecase;

    public UnidadeController(FindAllUnidadesUsecase findAllUnidadesUsecase, FindUnidadeByIdUsecase findUnidadeByIdUsecase, SaveUnidadeUseCase saveUnidadeUseCase, DeleteUnidadeByIdUsecase deleteUnidadeByIdUsecase) {
        this.findAllUnidadesUsecase = findAllUnidadesUsecase;
        this.findUnidadeByIdUsecase = findUnidadeByIdUsecase;
        this.saveUnidadeUseCase = saveUnidadeUseCase;
        this.deleteUnidadeByIdUsecase = deleteUnidadeByIdUsecase;
    }

    @GetMapping
    public List<Unidade> findAll() {
        return findAllUnidadesUsecase.execute();
    }

    @GetMapping("/{unidadeId}")
    public Unidade findById(@PathVariable("unidadeId") Long unidadeId) {
        return findUnidadeByIdUsecase.execute(unidadeId);
    }

    @PostMapping
    public Unidade save(@RequestBody Unidade unidade) {
        return saveUnidadeUseCase.execute(unidade);
    }

    @DeleteMapping("/{unidadeId}")
    public void deleteUnidadeByIdUsecase(@PathVariable("unidadeId") Long unidadeId) {
        deleteUnidadeByIdUsecase.execute(unidadeId);
    }
}