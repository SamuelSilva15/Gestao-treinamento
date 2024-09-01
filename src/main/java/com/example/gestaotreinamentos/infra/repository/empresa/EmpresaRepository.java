package com.example.gestaotreinamentos.infra.repository.empresa;

import com.example.gestaotreinamentos.infra.entity.empresa.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {
}
