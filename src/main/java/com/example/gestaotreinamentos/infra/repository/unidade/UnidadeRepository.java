package com.example.gestaotreinamentos.infra.repository.unidade;

import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends JpaRepository<UnidadeEntity, Long> {
}
