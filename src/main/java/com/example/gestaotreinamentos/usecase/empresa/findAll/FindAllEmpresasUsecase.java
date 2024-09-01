package com.example.gestaotreinamentos.usecase.empresa.findAll;

import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.infra.entity.empresa.EmpresaEntity;

import java.util.List;

public interface FindAllEmpresasUsecase {

    List<Empresa> execute();
}
