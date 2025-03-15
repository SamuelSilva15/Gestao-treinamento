package com.example.gestaotreinamentos.infra.repository.centrocusto;

import com.example.gestaotreinamentos.infra.entity.centrocusto.CentroCustoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentroCustoRepository extends JpaRepository<CentroCustoEntity, Long> {
}
