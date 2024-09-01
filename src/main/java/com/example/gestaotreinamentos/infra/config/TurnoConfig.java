package com.example.gestaotreinamentos.infra.config;

import com.example.gestaotreinamentos.application.gateway.turno.TurnoGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.turno.deleteById.DeleteTurnoByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.turno.findAll.FindAllTurnosUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.turno.findById.FindTurnoByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.turno.save.SaveTurnoUsecaseImpl;
import com.example.gestaotreinamentos.usecase.setor.save.SaveTurnoUsecase;
import com.example.gestaotreinamentos.usecase.turno.deleteById.DeleteTurnoByIdUsecase;
import com.example.gestaotreinamentos.usecase.turno.findAll.FindAllTurnosUsecase;
import com.example.gestaotreinamentos.usecase.turno.findById.FindTurnoByIdUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TurnoConfig {

    @Bean
    public FindAllTurnosUsecase findAllTurnosUsecase(TurnoGateway turnoGateway) {
        return new FindAllTurnosUsecaseImpl(turnoGateway);
    }

    @Bean
    public SaveTurnoUsecase saveTurnoUsecase(TurnoGateway turnoGateway) {
        return new SaveTurnoUsecaseImpl(turnoGateway);
    }

    @Bean
    public FindTurnoByIdUsecase findTurnoByIdUsecase(TurnoGateway turnoGateway) {
        return new FindTurnoByIdUsecaseImpl(turnoGateway);
    }

    @Bean
    public DeleteTurnoByIdUsecase deleteTurnoByIdUsecase(TurnoGateway turnoGateway) {
        return new DeleteTurnoByIdUsecaseImpl(turnoGateway);
    }
}