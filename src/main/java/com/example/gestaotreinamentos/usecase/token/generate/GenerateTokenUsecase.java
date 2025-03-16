package com.example.gestaotreinamentos.usecase.token.generate;

import com.example.gestaotreinamentos.infra.entity.user.User;

public interface GenerateTokenUsecase {
    String execute(User user);
}