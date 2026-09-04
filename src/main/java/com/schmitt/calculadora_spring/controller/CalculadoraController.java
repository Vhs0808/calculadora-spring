package com.schmitt.calculadora_spring.controller;

import com.schmitt.calculadora_spring.dto.CalculoResponseDto;
import com.schmitt.calculadora_spring.dto.ResponseDto;
import com.schmitt.calculadora_spring.dto.ValoresRequestDto;
import com.schmitt.calculadora_spring.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadora;
    @Autowired
    ResponseDto response;

    @PostMapping("/soma")
    public CalculoResponseDto soma(@RequestBody ValoresRequestDto valores){
        return calculadora.soma(valores);
    }

    @PostMapping("/subtracao")
    public CalculoResponseDto subtracao(@RequestBody ValoresRequestDto valores){
        return calculadora.subtracao(valores);
    }

    @PostMapping("/multiplicacao")
    public CalculoResponseDto multiplicacao(@RequestBody ValoresRequestDto valores) {
        return calculadora.multiplicacao(valores);
    }

    @PostMapping("/divisao")
    public CalculoResponseDto divisao(@RequestBody ValoresRequestDto valores) {
        return calculadora.divisao(valores);
    }

}
