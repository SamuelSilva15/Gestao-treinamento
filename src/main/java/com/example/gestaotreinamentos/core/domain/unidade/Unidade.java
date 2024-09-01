package com.example.gestaotreinamentos.core.domain.unidade;

import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.infra.entity.funcao.FuncaoEntity;
import com.example.gestaotreinamentos.infra.entity.setor.SetorEntity;
import com.example.gestaotreinamentos.infra.entity.turno.TurnoEntity;

public record Unidade(Long id, String nome, String cnpj, SetorEntity setor, TurnoEntity turno, CentroCustoEntity centroCusto, FuncaoEntity funcao) {}
