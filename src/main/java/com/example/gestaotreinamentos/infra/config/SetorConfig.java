package com.example.gestaotreinamentos.infra.config;

import com.example.gestaotreinamentos.application.gateway.setor.SetorGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.setor.deleteById.DeleteSetorByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.setor.findAll.FindAllSetoresUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.setor.findById.FindSetorByUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.setor.save.SaveSetorUsecaseImpl;
import com.example.gestaotreinamentos.usecase.setor.deleteById.DeleteSetorByIdUsecase;
import com.example.gestaotreinamentos.usecase.setor.findAll.FindAllSetoresUsecase;
import com.example.gestaotreinamentos.usecase.setor.findById.FindSetorByUsecase;
import com.example.gestaotreinamentos.usecase.setor.save.SaveSetorUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetorConfig {

    @Bean
    public FindAllSetoresUsecase findAllSetoresUsecase(SetorGateway setorGateway) {
        return new FindAllSetoresUsecaseImpl(setorGateway);
    }

    @Bean
    public SaveSetorUsecase saveSetorUsecase(SetorGateway setorGateway) {
        return new SaveSetorUsecaseImpl(setorGateway);
    }

    @Bean
    public FindSetorByUsecase findSetorByUsecase(SetorGateway setorGateway) {
        return new FindSetorByUsecaseImpl(setorGateway);
    }

    @Bean
    public DeleteSetorByIdUsecase deleteSetorByIdUsecase(SetorGateway setorGateway) {
        return new DeleteSetorByIdUsecaseImpl(setorGateway);
    }
}