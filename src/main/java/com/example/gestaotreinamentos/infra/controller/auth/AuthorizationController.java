package com.example.gestaotreinamentos.infra.controller.auth;

import com.example.gestaotreinamentos.core.domain.user.AuthorizationDTO;
import com.example.gestaotreinamentos.core.domain.user.LoginResponseDTO;
import com.example.gestaotreinamentos.core.domain.user.RegisterDTO;
import com.example.gestaotreinamentos.infra.entity.user.User;
import com.example.gestaotreinamentos.infra.service.TokenService;
import com.example.gestaotreinamentos.usecase.user.findByEmail.FindUserDetailsByEmailUsecase;
import com.example.gestaotreinamentos.usecase.user.save.SaveUserUsecase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("api/v1/auth")
public class AuthorizationController {

    private final AuthenticationManager authenticationManager;
    private final FindUserDetailsByEmailUsecase findUserDetailsByEmailUsecase;
    private final SaveUserUsecase saveUserUsecase;
    private final TokenService tokenService;

    public AuthorizationController(AuthenticationManager authenticationManager, FindUserDetailsByEmailUsecase findUserDetailsByEmailUsecase, SaveUserUsecase saveUserUsecase, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.findUserDetailsByEmailUsecase = findUserDetailsByEmailUsecase;
        this.saveUserUsecase = saveUserUsecase;
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Validated AuthorizationDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity<User> authorize(@RequestBody @Validated RegisterDTO registerDTO) {
        try {
            if(Objects.nonNull(this.findUserDetailsByEmailUsecase.execute(registerDTO.email()))) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }

            String encryptedPassword = new BCryptPasswordEncoder().encode(registerDTO.password());
            User user = new User(registerDTO.name(), registerDTO.email(), encryptedPassword, registerDTO.role());

            User userSaved = this.saveUserUsecase.execute(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(userSaved);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
