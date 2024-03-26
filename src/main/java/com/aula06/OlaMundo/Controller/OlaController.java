package com.aula06.OlaMundo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class OlaController {
    @GetMapping("/")
    public String getOlaMundo(){
        return "Olá meus Queridos";
    }
    
}
