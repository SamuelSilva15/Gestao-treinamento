package com.example.gestaotreinamentos.infra.service.empresa;

import com.example.gestaotreinamentos.application.gateway.empresa.EmpresaGateway;
import com.example.gestaotreinamentos.core.domain.empresa.Empresa;
import com.example.gestaotreinamentos.core.exception.empresa.EmpresaNotFoundException;
import com.example.gestaotreinamentos.infra.entity.empresa.EmpresaEntity;
import com.example.gestaotreinamentos.infra.mapper.empresa.EmpresaMapper;
import com.example.gestaotreinamentos.infra.repository.empresa.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaGatewayImpl implements EmpresaGateway {

    private final EmpresaRepository empresaRepository;
    private final EmpresaMapper empresaMapper;
    
    public EmpresaGatewayImpl(EmpresaRepository empresaRepository, EmpresaMapper empresaMapper) {
        this.empresaRepository = empresaRepository;
        this.empresaMapper = empresaMapper;
    }

    @Override
    public Empresa save(Empresa empresa) {
        EmpresaEntity empresaEntity = empresaMapper.toEmpresaEntity(empresa);
        empresaRepository.save(empresaEntity);
        return empresa;
    }

    @Override
    public List<Empresa> findAll() {
        List<EmpresaEntity> empresaEntities = empresaRepository.findAll();
        List<Empresa> empresaList = new ArrayList<>(empresaEntities.size());
        empresaEntities.forEach(empresaEntity -> {
            Empresa empresa = empresaMapper.toEmpresa(empresaEntity);
            empresaList.add(empresa);
        });

        return empresaList;
    }

    @Override
    public Empresa findById(Long empresaId) {
        EmpresaEntity empresaEntity = empresaRepository.findById(empresaId).orElseThrow(() -> new EmpresaNotFoundException(empresaId));
        return empresaMapper.toEmpresa(empresaEntity);
    }

    @Override
    public void deleteById(Long empresaId) {
        EmpresaEntity empresaEntity = empresaRepository.findById(empresaId).orElseThrow(() -> new EmpresaNotFoundException(empresaId));
        empresaRepository.delete(empresaEntity);
    }
}
