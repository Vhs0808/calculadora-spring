package com.schmitt.calculadora_spring.service;

import com.schmitt.calculadora_spring.dto.CalculoResponseDto;
import com.schmitt.calculadora_spring.dto.ValoresRequestDto;

import com.schmitt.calculadora_spring.excessoes.DivisaoPorZeroException;
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
        if (valores.getValor2() == 0) {
            throw new DivisaoPorZeroException("Não é possível dividir por zero.");
        }
        return new CalculoResponseDto(valores.getValor1() / valores.getValor2());
    }
}
