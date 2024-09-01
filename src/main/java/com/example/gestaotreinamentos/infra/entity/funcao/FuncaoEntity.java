package com.example.gestaotreinamentos.infra.entity.funcao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FUNCAO")
public class FuncaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FC_ID")
    private Long id;

    @Column(name = "FC_NOME")
    private String nome;
}
