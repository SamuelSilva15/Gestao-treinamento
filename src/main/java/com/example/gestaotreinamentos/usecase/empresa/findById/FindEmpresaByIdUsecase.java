package com.example.gestaotreinamentos.usecase.empresa.findById;

import com.example.gestaotreinamentos.core.domain.empresa.Empresa;

public interface FindEmpresaByIdUsecase {
    Empresa execute(Long empresaId);
}
