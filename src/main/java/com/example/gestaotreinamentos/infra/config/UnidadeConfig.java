package com.example.gestaotreinamentos.infra.config;

import com.example.gestaotreinamentos.application.gateway.unidade.UnidadeGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.unidade.deleteById.DeleteUnidadeByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.unidade.findAll.FindAllUnidadesUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.unidade.findById.FindUnidadeByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.unidade.saveUnidade.SaveUnidadeUsecaseImpl;

import com.example.gestaotreinamentos.usecase.unidade.deleteById.DeleteUnidadeByIdUsecase;
import com.example.gestaotreinamentos.usecase.unidade.findAll.FindAllUnidadesUsecase;
import com.example.gestaotreinamentos.usecase.unidade.findById.FindUnidadeByIdUsecase;
import com.example.gestaotreinamentos.usecase.unidade.saveUnidade.SaveUnidadeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UnidadeConfig {

    @Bean
    public FindAllUnidadesUsecase findAllUnidadesUsecase(UnidadeGateway unidadeGateway) {
        return new FindAllUnidadesUsecaseImpl(unidadeGateway);
    }

    @Bean
    public SaveUnidadeUseCase saveUnidadeUsecase(UnidadeGateway unidadeGateway) {
        return new SaveUnidadeUsecaseImpl(unidadeGateway);
    }

    @Bean
    public FindUnidadeByIdUsecase findUnidadeByIdUsecase(UnidadeGateway unidadeGateway) {
        return new FindUnidadeByIdUsecaseImpl(unidadeGateway);
    }

    @Bean
    public DeleteUnidadeByIdUsecase deleteUnidadeByIdUsecase(UnidadeGateway unidadeGateway) {
        return new DeleteUnidadeByIdUsecaseImpl(unidadeGateway);
    }
}
