package com.example.gestaotreinamentos.infra.mapper.unidade;

import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;
import org.springframework.stereotype.Component;

@Component
public class UnidadeMapper {

    public UnidadeEntity toUnidadeEntity(Unidade unidade) {
        return new UnidadeEntity(
                unidade.id(),
                unidade.nome(),
                unidade.cnpj(),
                unidade.setor(),
                unidade.turno(),
                unidade.centroCusto(),
                unidade.funcao());
    }

    public Unidade toUnidade(UnidadeEntity unidadeEntity) {
        return new Unidade(unidadeEntity.getId(), unidadeEntity.getNome(), unidadeEntity.getCnpj(), unidadeEntity.getSetor(), unidadeEntity.getTurno(),
                unidadeEntity.getCentroCusto(), unidadeEntity.getFuncao());
    }
}
