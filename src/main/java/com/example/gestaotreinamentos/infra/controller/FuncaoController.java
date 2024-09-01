package com.example.gestaotreinamentos.infra.controller;

import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.usecase.funcao.deleteById.DeleteFuncaoByIdUsecase;
import com.example.gestaotreinamentos.usecase.funcao.findAll.FindAllFuncoesUsecase;
import com.example.gestaotreinamentos.usecase.funcao.findById.FindFuncaoByIdUsecase;
import com.example.gestaotreinamentos.usecase.funcao.save.SaveFuncaoUsecase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/funcao")
public class FuncaoController {

    private final FindAllFuncoesUsecase findAllFuncoesUsecase;
    private final FindFuncaoByIdUsecase findFuncaoByIdUsecase;
    private final SaveFuncaoUsecase saveFuncaoUsecase;
    private final DeleteFuncaoByIdUsecase deleteFuncaoByIdUsecase;

    public FuncaoController(FindAllFuncoesUsecase findAllFuncoesUsecase, FindFuncaoByIdUsecase findFuncaoByIdUsecase, DeleteFuncaoByIdUsecase deleteFuncaoByIdUsecase, SaveFuncaoUsecase saveFuncaoUsecase) {
        this.findAllFuncoesUsecase = findAllFuncoesUsecase;
        this.findFuncaoByIdUsecase = findFuncaoByIdUsecase;
        this.deleteFuncaoByIdUsecase = deleteFuncaoByIdUsecase;
        this.saveFuncaoUsecase = saveFuncaoUsecase;
    }

    @GetMapping
    public List<Funcao> findAll() {
        return findAllFuncoesUsecase.execute();
    }

    @GetMapping("/{funcaoId}")
    public Funcao findById(@PathVariable("funcaoId") Long funcaoId) {
        return findFuncaoByIdUsecase.execute(funcaoId);
    }

    @PostMapping
    public Funcao save(@RequestBody Funcao funcao) {
        return saveFuncaoUsecase.execute(funcao);
    }

    @DeleteMapping("/{funcaoId}")
    public void deleteById(@PathVariable("funcaoId") Long funcaoId) {
        deleteFuncaoByIdUsecase.execute(funcaoId);
    }
}
