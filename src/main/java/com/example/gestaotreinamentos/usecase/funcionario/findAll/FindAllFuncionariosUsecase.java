package com.example.gestaotreinamentos.usecase.funcionario.findAll;

import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;

import java.util.List;

public interface FindAllFuncionariosUsecase {
    List<Funcionario> execute();
}
