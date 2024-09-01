package com.example.gestaotreinamentos.infra.mapper.setor;

import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.infra.entity.setor.SetorEntity;
import org.springframework.stereotype.Component;

@Component
public class SetorMapper {

    public SetorEntity toSetorEntity(Setor setor) {
        return new SetorEntity(
                setor.id(),
                setor.nome()
        );
    }

    public Setor toSetor(SetorEntity setorEntity) {
        return new Setor(setorEntity.getId(), setorEntity.getNome());
    }
}
