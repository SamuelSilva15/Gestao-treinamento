package com.example.gestaotreinamentos.application.gateway.unidade;

import com.example.gestaotreinamentos.core.domain.unidade.Unidade;

import java.util.List;

public interface UnidadeGateway {
    Unidade saveUnidade(Unidade unidade);
    void deleteById(Long unidadeId);
    List<Unidade> findAll();
    Unidade findUnidadeById(Long unidadeId);
}
