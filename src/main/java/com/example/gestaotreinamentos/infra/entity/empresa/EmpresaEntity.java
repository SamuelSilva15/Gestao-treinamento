package com.example.gestaotreinamentos.infra.entity.empresa;

import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPRESA")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EM_ID")
    private Long id;

    @Column(name = "EM_NOME")
    private String nome;

    @Column(name = "EM_CNPJ")
    private String cnpj;

    @OneToMany(fetch = FetchType.LAZY)
    private List<UnidadeEntity> unidades;
}
