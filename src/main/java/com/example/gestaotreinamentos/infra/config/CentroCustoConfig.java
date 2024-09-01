package com.example.gestaotreinamentos.infra.config;

import com.example.gestaotreinamentos.application.gateway.centrocusto.CentroCustoGateway;
import com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.deleteById.DeleteCentroCustoByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.findAll.FindAllCentroCustosUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.findById.FindCentroCustoByIdUsecaseImpl;
import com.example.gestaotreinamentos.application.usecaseimpl.centrocusto.save.SaveCentroCustoUsecaseImpl;
import com.example.gestaotreinamentos.usecase.centrocusto.SaveCentroCustoUsecase;
import com.example.gestaotreinamentos.usecase.centrocusto.deleteById.DeleteCentroCustoByIdUsecase;
import com.example.gestaotreinamentos.usecase.centrocusto.findAll.FindAllCentroCustosUsecase;
import com.example.gestaotreinamentos.usecase.centrocusto.findById.FindCentroCustoByIdUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CentroCustoConfig {

    @Bean
    public FindAllCentroCustosUsecase findAllCentroCustosUsecase(CentroCustoGateway centroCustoGateway) {
        return new FindAllCentroCustosUsecaseImpl(centroCustoGateway);
    }

    @Bean
    public SaveCentroCustoUsecase saveCentroCustoUsecase(CentroCustoGateway centroCustoGateway) {
        return new SaveCentroCustoUsecaseImpl(centroCustoGateway);
    }

    @Bean
    public FindCentroCustoByIdUsecase findCentroCustoByIdUsecase(CentroCustoGateway centroCustoGateway) {
        return new FindCentroCustoByIdUsecaseImpl(centroCustoGateway);
    }

    @Bean
    public DeleteCentroCustoByIdUsecase deleteCentroCustoByIdUsecase(CentroCustoGateway centroCustoGateway) {
        return new DeleteCentroCustoByIdUsecaseImpl(centroCustoGateway);
    }
}