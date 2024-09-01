package com.example.gestaotreinamentos.infra.controller;

import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.usecase.empresa.deleteById.DeleteEmpresaByIdUsecase;
import com.example.gestaotreinamentos.usecase.empresa.findAll.FindAllEmpresasUsecase;
import com.example.gestaotreinamentos.usecase.empresa.findById.FindEmpresaByIdUsecase;
import com.example.gestaotreinamentos.usecase.empresa.save.SaveEmpresaUsecase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/empresa")
public class EmpresaController {

    private final FindAllEmpresasUsecase findAllEmpresasUsecase;
    private final SaveEmpresaUsecase saveEmpresaUsecase;
    private final FindEmpresaByIdUsecase findEmpresaByIdUsecase;
    private final DeleteEmpresaByIdUsecase deleteEmpresaByIdUsecase;

    public EmpresaController(FindAllEmpresasUsecase findAllEmpresasUsecase, SaveEmpresaUsecase saveEmpresaUsecase, FindEmpresaByIdUsecase findEmpresaByIdUsecase,
                             DeleteEmpresaByIdUsecase deleteEmpresaByIdUsecase) {
        this.findAllEmpresasUsecase = findAllEmpresasUsecase;
        this.saveEmpresaUsecase = saveEmpresaUsecase;
        this.findEmpresaByIdUsecase = findEmpresaByIdUsecase;
        this.deleteEmpresaByIdUsecase = deleteEmpresaByIdUsecase;
    }

    @GetMapping
    public List<Empresa> findAll() {
        return findAllEmpresasUsecase.execute();
    }

    @GetMapping("/{empresaId}")
    public Empresa findById(@PathVariable("empresaId") Long empresaId) {
        return findEmpresaByIdUsecase.execute(empresaId);
    }

    @PostMapping
    public Empresa save(@RequestBody Empresa empresa) {
        return saveEmpresaUsecase.execute(empresa);
    }

    @DeleteMapping("/{empresaId}")
    public void deleteById(@PathVariable("empresaId") Long empresaId) {
        deleteEmpresaByIdUsecase.execute(empresaId);
    }
}
