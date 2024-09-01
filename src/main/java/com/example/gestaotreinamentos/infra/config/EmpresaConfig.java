package com.example.gestaotreinamentos.infra.config;

import com.example.gestaotreinamentos.application.gateway.empresa.EmpresaGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.empresa.deleteById.DeleteEmpresaByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.empresa.findAll.FindAllEmpresasUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.empresa.findById.FindEmpresaByIdIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.empresa.save.SaveEmpresaUsecaseImpl;
import com.example.gestaotreinamentos.usecase.empresa.deleteById.DeleteEmpresaByIdUsecase;
import com.example.gestaotreinamentos.usecase.empresa.findAll.FindAllEmpresasUsecase;
import com.example.gestaotreinamentos.usecase.empresa.save.SaveEmpresaUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpresaConfig {

    @Bean
    public FindAllEmpresasUsecase findAllEmpresasUsecase(EmpresaGateway empresaGateway) {
        return new FindAllEmpresasUsecaseImpl(empresaGateway);
    }

    @Bean
    public SaveEmpresaUsecase saveEmpresaUsecase(EmpresaGateway empresaGateway) {
        return new SaveEmpresaUsecaseImpl(empresaGateway);
    }

    @Bean
    public FindEmpresaByIdIdUsecaseImpl findEmpresaByIdUsecase(EmpresaGateway empresaGateway) {
        return new FindEmpresaByIdIdUsecaseImpl(empresaGateway);
    }

    @Bean
    public DeleteEmpresaByIdUsecase deleteEmpresaByIdUsecase(EmpresaGateway empresaGateway) {
        return new DeleteEmpresaByIdUsecaseImpl(empresaGateway);
    }
}