package com.example.gestaotreinamentos.infra.repository.funcao;

import com.example.gestaotreinamentos.infra.entity.funcao.FuncaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncaoRepository extends JpaRepository<FuncaoEntity, Long> {
}
