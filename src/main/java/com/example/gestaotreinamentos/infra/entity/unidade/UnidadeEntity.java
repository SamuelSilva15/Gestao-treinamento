package com.example.gestaotreinamentos.infra.entity.unidade;

import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.infra.entity.empresa.EmpresaEntity;
import com.example.gestaotreinamentos.infra.entity.funcao.FuncaoEntity;
import com.example.gestaotreinamentos.infra.entity.funcionario.FuncionarioEntity;
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
@Table(name = "UNIDADE")
public class UnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UN_ID")
    private Long id;

    @Column(name = "UN_NOME")
    private String nome;

    @Column(name = "UN_CNPJ")
    private String cnpj;

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
}
