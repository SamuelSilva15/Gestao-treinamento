package com.example.gestaotreinamentos.infra.config.entities;

import com.example.gestaotreinamentos.application.gateway.user.UserGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.user.findByEmail.FindUserDetailsByEmailUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.user.findById.FindUserDetailsByIdUsecaseUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.user.save.SaveUserUsecaseImpl;
import com.example.gestaotreinamentos.usecase.user.findByEmail.FindUserDetailsByEmailUsecase;
import com.example.gestaotreinamentos.usecase.user.findById.FindUserDetailsByIdUsecase;
import com.example.gestaotreinamentos.usecase.user.save.SaveUserUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public FindUserDetailsByIdUsecase findUserDetailsByIdUsecase(UserGateway userGateway) {
        return new FindUserDetailsByIdUsecaseUsecaseImpl(userGateway);
    }
    @Bean
    public FindUserDetailsByEmailUsecase findUserDetailsByEmailUsecase(UserGateway userGateway) {
        return new FindUserDetailsByEmailUsecaseImpl(userGateway);
    }

    @Bean
    public SaveUserUsecase saveUserUsecase(UserGateway userGateway) {
        return new SaveUserUsecaseImpl(userGateway);
    }
}
