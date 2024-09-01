package com.example.gestaotreinamentos.infra.service.funcao;

import com.example.gestaotreinamentos.application.gateway.funcao.FuncaoGateway;
import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.core.exception.funcao.FuncaoNotFoundException;
import com.example.gestaotreinamentos.infra.entity.funcao.FuncaoEntity;
import com.example.gestaotreinamentos.infra.mapper.funcao.FuncaoMapper;
import com.example.gestaotreinamentos.infra.repository.funcao.FuncaoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncaoGatewayImpl implements FuncaoGateway {

    private final FuncaoRepository funcaoRepository;
    private final FuncaoMapper funcaoMapper;

    public FuncaoGatewayImpl(FuncaoRepository funcaoRepository, FuncaoMapper funcaoMapper) {
        this.funcaoRepository = funcaoRepository;
        this.funcaoMapper = funcaoMapper;
    }

    @Override
    public Funcao save(Funcao funcao) {
        FuncaoEntity funcaoEntity = funcaoMapper.toFuncaoEntity(funcao);
        funcaoRepository.save(funcaoEntity);
        return funcao;
    }

    @Override
    public List<Funcao> findAll() {
        List<FuncaoEntity> funcaoEntityList = funcaoRepository.findAll();
        List<Funcao> funcaoList = new ArrayList<>(funcaoEntityList.size());
        funcaoEntityList.forEach(funcaoEntity -> {
            Funcao funcao = funcaoMapper.toFuncao(funcaoEntity);
            funcaoList.add(funcao);
        });

        return funcaoList;
    }

    @Override
    public Funcao findById(Long funcaoId) {
        FuncaoEntity funcaoEntity = funcaoRepository.findById(funcaoId).orElseThrow(() -> new FuncaoNotFoundException(funcaoId));
        return funcaoMapper.toFuncao(funcaoEntity);
    }

    @Override
    public void deleteById(Long funcaoId) {
        FuncaoEntity funcaoEntity = funcaoRepository.findById(funcaoId).orElseThrow(() -> new FuncaoNotFoundException(funcaoId));
        funcaoRepository.delete(funcaoEntity);
    }
}
