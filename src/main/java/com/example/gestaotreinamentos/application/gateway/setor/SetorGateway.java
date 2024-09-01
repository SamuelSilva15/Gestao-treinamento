package com.example.gestaotreinamentos.application.gateway.setor;

import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.infra.entity.setor.SetorEntity;

import java.util.List;

public interface SetorGateway {
    List<Setor> findAll();
    Setor findById(Long setorId);
    Setor saveSetorEntity(Setor setor);
    void deleteById(Long setorId);
}
