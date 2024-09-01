package com.example.gestaotreinamentos.infra.config;

import com.example.gestaotreinamentos.application.gateway.funcao.FuncaoGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.funcao.deleteById.DeleteFuncaoByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.funcao.findAll.FindAllFuncoesUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.funcao.findById.FindFuncaoByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.funcao.save.SaveFuncaoUsecaseImpl;
import com.example.gestaotreinamentos.usecase.funcao.deleteById.DeleteFuncaoByIdUsecase;
import com.example.gestaotreinamentos.usecase.funcao.findAll.FindAllFuncoesUsecase;
import com.example.gestaotreinamentos.usecase.funcao.findById.FindFuncaoByIdUsecase;
import com.example.gestaotreinamentos.usecase.funcao.save.SaveFuncaoUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FuncaoConfig {

    @Bean
    public FindAllFuncoesUsecase findAllFuncoesUsecase(FuncaoGateway funcaoGateway) {
        return new FindAllFuncoesUsecaseImpl(funcaoGateway);
    }

    @Bean
    public SaveFuncaoUsecase saveFuncaoUsecase(FuncaoGateway funcaoGateway) {
        return new SaveFuncaoUsecaseImpl(funcaoGateway);
    }

    @Bean
    public FindFuncaoByIdUsecase findFuncaoByIdUsecase(FuncaoGateway funcaoGateway) {
        return new FindFuncaoByIdUsecaseImpl(funcaoGateway);
    }

    @Bean
    public DeleteFuncaoByIdUsecase deleteFuncaoByIdUsecase(FuncaoGateway funcaoGateway) {
        return new DeleteFuncaoByIdUsecaseImpl(funcaoGateway);
    }
}
