package com.example.gestaotreinamentos.application.gateway.funcionario;

import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;
import java.util.List;

public interface FuncionarioGateway {
    Funcionario save(Funcionario funcionario);
    List<Funcionario> findAll();
    Funcionario findById(Long funcionarioId);
    void deleteById(Long funcionarioId);
}
