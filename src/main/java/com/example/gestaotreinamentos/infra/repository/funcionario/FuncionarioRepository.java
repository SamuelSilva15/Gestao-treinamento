package com.example.gestaotreinamentos.infra.repository.funcionario;

import com.example.gestaotreinamentos.infra.entity.funcionario.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
}
