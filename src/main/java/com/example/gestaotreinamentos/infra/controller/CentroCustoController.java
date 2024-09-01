package com.example.gestaotreinamentos.infra.controller;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.usecase.centrocusto.SaveCentroCustoUsecase;
import com.example.gestaotreinamentos.usecase.centrocusto.deleteById.DeleteCentroCustoByIdUsecase;
import com.example.gestaotreinamentos.usecase.centrocusto.findAll.FindAllCentroCustosUsecase;
import com.example.gestaotreinamentos.usecase.centrocusto.findById.FindCentroCustoByIdUsecase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/centro-custo")
public class CentroCustoController {

    private final FindAllCentroCustosUsecase findAllCentroCustosUsecase;
    private final FindCentroCustoByIdUsecase findCentroCustoByIdUsecase;
    private final SaveCentroCustoUsecase saveCentroCustoUsecase;
    private final DeleteCentroCustoByIdUsecase deleteCentroCustoByIdUsecase;

    public CentroCustoController(FindAllCentroCustosUsecase findAllCentroCustosUsecase, FindCentroCustoByIdUsecase findCentroCustoByIdUsecase, SaveCentroCustoUsecase saveCentroCustoUsecase, DeleteCentroCustoByIdUsecase deleteCentroCustoByIdUsecase) {
        this.findAllCentroCustosUsecase = findAllCentroCustosUsecase;
        this.findCentroCustoByIdUsecase = findCentroCustoByIdUsecase;
        this.saveCentroCustoUsecase = saveCentroCustoUsecase;
        this.deleteCentroCustoByIdUsecase = deleteCentroCustoByIdUsecase;
    }

    @GetMapping
    public List<CentroCusto> findAll() {
        return findAllCentroCustosUsecase.execute();
    }

    @GetMapping("/{centroCustoId}")
    public CentroCusto findById(@PathVariable("centroCustoId") Long centroCustoId) {
        return findCentroCustoByIdUsecase.execute(centroCustoId);
    }

    @PostMapping
    public CentroCustoEntity save(@RequestBody CentroCusto centroCusto) {
        return saveCentroCustoUsecase.execute(centroCusto);
    }

    @DeleteMapping("/{centroCustoId}")
    public void deleteById(@PathVariable("centroCustoId") Long centroCustoId) {
        deleteCentroCustoByIdUsecase.execute(centroCustoId);
    }
}
