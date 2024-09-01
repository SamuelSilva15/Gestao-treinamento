package com.example.gestaotreinamentos.usecase.funcionario.save;

import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;

public interface SaveFuncionarioUsecase {
    Funcionario execute(Funcionario funcionario);
}
