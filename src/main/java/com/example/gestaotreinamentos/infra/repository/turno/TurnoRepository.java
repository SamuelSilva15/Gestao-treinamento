package com.example.gestaotreinamentos.infra.repository.turno;

import com.example.gestaotreinamentos.infra.entity.turno.TurnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<TurnoEntity, Long> {
}
