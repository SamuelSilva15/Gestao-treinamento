package com.example.gestaotreinamentos.infra.controller;

import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;
import com.example.gestaotreinamentos.usecase.funcionario.deleteById.DeleteFuncionarioByIdUsecase;
import com.example.gestaotreinamentos.usecase.funcionario.findAll.FindAllFuncionariosUsecase;
import com.example.gestaotreinamentos.usecase.funcionario.findById.FindFuncionarioByUsecase;
import com.example.gestaotreinamentos.usecase.funcionario.save.SaveFuncionarioUsecase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/funcionario")
public class FuncionarioController {

    private final FindAllFuncionariosUsecase findAllFuncionariosUsecase;
    private final FindFuncionarioByUsecase findFuncionarioByUsecase;
    private final SaveFuncionarioUsecase saveFuncionarioUsecase;
    private final DeleteFuncionarioByIdUsecase deleteFuncionarioByIdUsecase;


    public FuncionarioController(FindAllFuncionariosUsecase findAllFuncionariosUsecase, FindFuncionarioByUsecase findFuncionarioByUsecase, SaveFuncionarioUsecase saveFuncionarioUsecase, DeleteFuncionarioByIdUsecase deleteFuncionarioByIdUsecase) {
        this.findAllFuncionariosUsecase = findAllFuncionariosUsecase;
        this.findFuncionarioByUsecase = findFuncionarioByUsecase;
        this.saveFuncionarioUsecase = saveFuncionarioUsecase;
        this.deleteFuncionarioByIdUsecase = deleteFuncionarioByIdUsecase;
    }

    @GetMapping
    public List<Funcionario> findAll() {
        return findAllFuncionariosUsecase.execute();
    }

    @GetMapping("/{funcionarioId}")
    public Funcionario findById(@PathVariable("funcionarioId") Long funcionarioId) {
        return findFuncionarioByUsecase.execute(funcionarioId);
    }

    @PostMapping
    public Funcionario save(@RequestBody Funcionario funcionario) {
        return saveFuncionarioUsecase.execute(funcionario);
    }

    @DeleteMapping("/{funcionarioId}")
    public void deleteById(@PathVariable("funcionarioId") Long funcionarioId) {
        deleteFuncionarioByIdUsecase.execute(funcionarioId);
    }
}
