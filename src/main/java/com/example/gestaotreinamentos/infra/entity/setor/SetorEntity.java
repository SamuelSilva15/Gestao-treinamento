package com.example.gestaotreinamentos.infra.entity.setor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SETOR")
public class SetorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ST_ID")
    private Long id;

    @Column(name = "ST_NOME")
    private String nome;
}