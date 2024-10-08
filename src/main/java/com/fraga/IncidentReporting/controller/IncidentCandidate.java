package com.fraga.IncidentReporting.controller;

import com.fraga.IncidentReporting.exception.CPFInexistenteException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/busca-dados-pessoa")
public class IncidentCandidate {

    @GetMapping("{cpf}")
    private String buscaDadosPessoa(@PathVariable Long cpf){
        
        if (cpf == 12345678910L) {
            return "CPF Válido";
        }else {
            throw new CPFInexistenteException();
        }
    }
}
