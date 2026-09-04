package com.schmitt.calculadora_spring.service;

import com.schmitt.calculadora_spring.dto.CalculoResponseDto;
import com.schmitt.calculadora_spring.dto.ValoresRequestDto;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public CalculoResponseDto soma(ValoresRequestDto valores){
        return new CalculoResponseDto(valores.getValor1() + valores.getValor2());
    }

    public CalculoResponseDto subtracao(ValoresRequestDto valores){
        return new CalculoResponseDto(valores.getValor1() - valores.getValor2());
    }

    public CalculoResponseDto multiplicacao(ValoresRequestDto valores) {
        return new CalculoResponseDto(valores.getValor1() * valores.getValor2());
    }

    public CalculoResponseDto divisao(ValoresRequestDto valores) {
        return new CalculoResponseDto(valores.getValor1() / valores.getValor2());
    }
}
