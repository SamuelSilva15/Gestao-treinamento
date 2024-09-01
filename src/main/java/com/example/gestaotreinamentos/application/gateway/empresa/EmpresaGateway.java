package com.example.gestaotreinamentos.application.gateway.empresa;

import com.example.gestaotreinamentos.core.domain.empresa.Empresa;

import java.util.List;

public interface EmpresaGateway {
    Empresa save(Empresa empresa);
    List<Empresa> findAll();
    Empresa findById(Long empresaId);
    void deleteById(Long empresaId);
}
