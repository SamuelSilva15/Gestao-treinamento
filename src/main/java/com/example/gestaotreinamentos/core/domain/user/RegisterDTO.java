package com.example.gestaotreinamentos.core.domain.user;

import com.example.gestaotreinamentos.core.domain.enums.EnumUserRole;

public record RegisterDTO(String name, String email, String password, EnumUserRole role) {
}
