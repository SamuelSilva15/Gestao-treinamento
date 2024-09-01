package com.example.gestaotreinamentos.core.domain.funcionario;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.core.domain.enums.EnumSituacao;
import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.core.domain.turno.Turno;


public record Funcionario(Long id, String nome, String re, String cpfCnpj, Setor setor,
                          Turno turno, CentroCusto centroCusto, Funcao funcao, EnumSituacao situacao) {
}
