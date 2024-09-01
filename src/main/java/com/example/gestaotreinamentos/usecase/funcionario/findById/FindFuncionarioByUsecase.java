package com.example.gestaotreinamentos.usecase.funcionario.findById;

import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;

public interface FindFuncionarioByUsecase {
    Funcionario execute(Long funcionarioId);
}
