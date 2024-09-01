package com.example.gestaotreinamentos.usecase.empresa.save;


import com.example.gestaotreinamentos.core.domain.empresa.Empresa;

public interface SaveEmpresaUsecase {
    Empresa execute(Empresa empresa);
}
