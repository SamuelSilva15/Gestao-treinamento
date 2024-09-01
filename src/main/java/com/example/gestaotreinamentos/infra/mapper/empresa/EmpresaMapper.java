package com.example.gestaotreinamentos.infra.mapper.empresa;

import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.core.domain.unidade.Unidade;
import com.example.gestaotreinamentos.infra.entity.empresa.EmpresaEntity;
import com.example.gestaotreinamentos.infra.entity.unidade.UnidadeEntity;
import com.example.gestaotreinamentos.infra.mapper.unidade.UnidadeMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpresaMapper {

    private final UnidadeMapper unidadeMapper;

    public EmpresaMapper(UnidadeMapper unidadeMapper) {
        this.unidadeMapper = unidadeMapper;
    }

    public EmpresaEntity toEmpresaEntity(Empresa empresa) {
        List<UnidadeEntity> unidades = getUnidades(empresa);
        return new EmpresaEntity(
                empresa.id(),
                empresa.nome(),
                empresa.cnpj(),
                unidades
        );
    }

    private List<UnidadeEntity> getUnidades(Empresa empresa) {
        List<UnidadeEntity> unidades = new ArrayList<>(empresa.unidades().size());
        empresa.unidades().forEach(unidade -> {
            UnidadeEntity unidadeEntity = unidadeMapper.toUnidadeEntity(unidade);
            unidades.add(unidadeEntity);
        });
        return unidades;
    }

    public Empresa toEmpresa(EmpresaEntity empresaEntity) {
        List<Unidade> unidades = getUnidades(empresaEntity);
        return new Empresa(empresaEntity.getId(), empresaEntity.getNome(), empresaEntity.getCnpj(), unidades);
    }

    private List<Unidade> getUnidades(EmpresaEntity empresaEntity) {
        List<Unidade> unidades = new ArrayList<>(empresaEntity.getUnidades().size());
        empresaEntity.getUnidades().forEach(unidadeEntity -> {
            Unidade unidade = unidadeMapper.toUnidade(unidadeEntity);
            unidades.add(unidade);
        });
        return unidades;
    }
}
