package com.example.gestaotreinamentos.application.gateway.token;

import com.example.gestaotreinamentos.infra.entity.user.User;

public interface TokenGateway {
    String execute(User user);
    String validate(String token);
}
