package com.example.gestaotreinamentos.infra.mapper.funcao;

import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.infra.entity.funcao.FuncaoEntity;
import org.springframework.stereotype.Component;

@Component
public class FuncaoMapper {
    public FuncaoEntity toFuncaoEntity(Funcao funcao) {
        return new FuncaoEntity(funcao.id(), funcao.nome());
    }

    public Funcao toFuncao(FuncaoEntity funcaoEntity) {
        return new Funcao(funcaoEntity.getId(), funcaoEntity.getNome());
    }
}
