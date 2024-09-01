package com.example.gestaotreinamentos.core.domain.empresa;

import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;

import java.util.List;

public record Empresa(Long id, String nome, String cnpj, List<Unidade> unidades) {}