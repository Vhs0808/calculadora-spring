package com.schmitt.calculadora_spring.excessoes;

public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException(String message) {
        super(message);
    }
}
