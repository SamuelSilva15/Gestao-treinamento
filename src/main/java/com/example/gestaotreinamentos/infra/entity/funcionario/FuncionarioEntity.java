package com.example.gestaotreinamentos.infra.entity.funcionario;

import com.example.gestaotreinamentos.core.domain.enums.EnumSituacao;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.infra.entity.funcao.FuncaoEntity;
import com.example.gestaotreinamentos.infra.entity.setor.SetorEntity;
import com.example.gestaotreinamentos.infra.entity.turno.TurnoEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FUNCIONARIO")
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FE_ID")
    private Long id;

    @Column(name = "FE_NOME")
    private String nome;

    @Column(name = "FE_RE")
    private String re;

    @Column(name = "FE_CPF_CNPJ")
    private String cpfCnpj;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ST_ID")
    @JsonProperty("setores")
    private SetorEntity setor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "TN_ID")
    @JsonProperty("turnos")
    private TurnoEntity turno;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CC_ID")
    @JsonProperty("centros")
    private CentroCustoEntity centroCusto;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "FC_ID", nullable = false)
    @JsonProperty("funcoes")
    private FuncaoEntity funcao;

    @Enumerated(EnumType.STRING)
    private EnumSituacao situacao;
}
