package com.example.gestaotreinamentos.application.gateway.funcao;

import com.example.gestaotreinamentos.core.domain.funcao.Funcao;

import java.util.List;

public interface FuncaoGateway {
    Funcao save(Funcao funcao);
    List<Funcao> findAll();
    Funcao findById(Long funcaoId);
    void deleteById(Long funcaoId);
}
