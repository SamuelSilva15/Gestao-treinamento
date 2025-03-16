package com.example.gestaotreinamentos.infra.config.entities;

import com.example.gestaotreinamentos.application.gateway.token.TokenGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.token.generate.GenerateTokenUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.token.validate.ValidateTokenUsecaseImpl;
import com.example.gestaotreinamentos.usecase.token.generate.GenerateTokenUsecase;
import com.example.gestaotreinamentos.usecase.token.validate.ValidateTokenUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenConfig {

    @Bean
    public GenerateTokenUsecase generateTokenUsecase(TokenGateway tokenGateway) {
        return new GenerateTokenUsecaseImpl(tokenGateway);
    }

    @Bean
    public ValidateTokenUsecase validateTokenUsecase(TokenGateway tokenGateway) {
        return new ValidateTokenUsecaseImpl(tokenGateway);
    }
}
