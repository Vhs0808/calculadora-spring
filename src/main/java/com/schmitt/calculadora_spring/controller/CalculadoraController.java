package com.schmitt.calculadora_spring.controller;

import com.schmitt.calculadora_spring.dto.CalculoResponseDto;
import com.schmitt.calculadora_spring.dto.ValoresRequestDto;
import com.schmitt.calculadora_spring.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadora;

    @RequestMapping("/soma")
    public CalculoResponseDto soma(@RequestBody ValoresRequestDto valores){
        return calculadora.soma(valores);
    }

}
