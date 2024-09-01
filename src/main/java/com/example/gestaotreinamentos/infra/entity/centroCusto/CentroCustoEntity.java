package com.example.gestaotreinamentos.infra.entity.centroCusto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CENTRO_CUSTO")
public class CentroCustoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CC_ID")
    private Long id;

    @Column(name = "CC_NOME")
    private String nome;
}
