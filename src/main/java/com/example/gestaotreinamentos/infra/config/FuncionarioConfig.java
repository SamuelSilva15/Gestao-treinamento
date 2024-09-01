package com.example.gestaotreinamentos.infra.config;

import com.example.gestaotreinamentos.application.gateway.funcionario.FuncionarioGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.funcionario.deleteById.DeleteFuncionarioByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.funcionario.findAll.FindAllFuncionarioUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.funcionario.findById.FindFuncionarioByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.funcionario.save.SaveFuncionarioUsecaseImpl;
import com.example.gestaotreinamentos.usecase.funcionario.deleteById.DeleteFuncionarioByIdUsecase;
import com.example.gestaotreinamentos.usecase.funcionario.findAll.FindAllFuncionariosUsecase;
import com.example.gestaotreinamentos.usecase.funcionario.findById.FindFuncionarioByUsecase;
import com.example.gestaotreinamentos.usecase.funcionario.save.SaveFuncionarioUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FuncionarioConfig {

    @Bean
    public FindAllFuncionariosUsecase findAllFuncionariosUsecase(FuncionarioGateway funcionarioGateway) {
        return new FindAllFuncionarioUsecaseImpl(funcionarioGateway);
    }

    @Bean
    public SaveFuncionarioUsecase saveFuncionarioUsecase(FuncionarioGateway funcionarioGateway) {
        return new SaveFuncionarioUsecaseImpl(funcionarioGateway);
    }

    @Bean
    public FindFuncionarioByUsecase findFuncionarioByUsecase(FuncionarioGateway funcionarioGateway) {
        return new FindFuncionarioByIdUsecaseImpl(funcionarioGateway);
    }

    @Bean
    public DeleteFuncionarioByIdUsecase deleteFuncionarioByIdUsecase(FuncionarioGateway funcionarioGateway) {
        return new DeleteFuncionarioByIdUsecaseImpl(funcionarioGateway);
    }
}
