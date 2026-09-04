package com.schmitt.calculadora_spring.excessoes;

import com.schmitt.calculadora_spring.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DivisaoPorZeroException.class)
    public ResponseEntity<ResponseDto> handleDivisaoPorZeroException(DivisaoPorZeroException e){
        ResponseDto erro = new ResponseDto(e.getMessage());
        return ResponseEntity.badRequest().body(erro);
    }
}
