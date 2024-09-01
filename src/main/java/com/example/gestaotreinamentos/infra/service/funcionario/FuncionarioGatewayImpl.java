package com.example.gestaotreinamentos.infra.service.funcionario;

import com.example.gestaotreinamentos.application.gateway.funcionario.FuncionarioGateway;
import com.example.gestaotreinamentos.core.domain.enums.EnumSituacao;
import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;
import com.example.gestaotreinamentos.core.exception.funcionario.FuncionarioNotFoundException;
import com.example.gestaotreinamentos.infra.entity.funcionario.FuncionarioEntity;
import com.example.gestaotreinamentos.infra.mapper.funcionario.FuncionarioMapper;
import com.example.gestaotreinamentos.infra.repository.funcionario.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioGatewayImpl implements FuncionarioGateway {

    private final FuncionarioRepository funcionarioRepository;
    private final FuncionarioMapper funcionarioMapper;

    public FuncionarioGatewayImpl(FuncionarioRepository funcionarioRepository, FuncionarioMapper funcionarioMapper) {
        this.funcionarioRepository = funcionarioRepository;
        this.funcionarioMapper = funcionarioMapper;
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        FuncionarioEntity funcionarioEntity = funcionarioMapper.toFuncionarioEntity(funcionario);
        funcionarioEntity.setSituacao(EnumSituacao.ATIVO);
        funcionarioRepository.save(funcionarioEntity);
        return funcionario;
    }

    @Override
    public List<Funcionario> findAll() {
        List<FuncionarioEntity> funcionarioEntities = funcionarioRepository.findAll();
        List<Funcionario> funcionarioList = new ArrayList<>(funcionarioEntities.size());
        funcionarioEntities.forEach(funcionarioEntity -> {
            Funcionario funcionario = funcionarioMapper.toFuncionario(funcionarioEntity);
            funcionarioList.add(funcionario);
        });

        return funcionarioList;
    }

    @Override
    public Funcionario findById(Long funcionarioId) {
        FuncionarioEntity funcionarioEntity = funcionarioRepository.findById(funcionarioId).orElseThrow(() -> new FuncionarioNotFoundException(funcionarioId));
        return funcionarioMapper.toFuncionario(funcionarioEntity);
    }

    @Override
    public void deleteById(Long funcionarioId) {
        FuncionarioEntity funcionarioEntity = funcionarioRepository.findById(funcionarioId).orElseThrow(() -> new FuncionarioNotFoundException(funcionarioId));
        funcionarioRepository.delete(funcionarioEntity);
    }
}
