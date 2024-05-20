package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!!";
	}	
	@GetMapping("/bsms")
    public String getBSMs() {
		return "Comunicação, Proatividade, Orientação ao detalhe";
	}
	
	@GetMapping("/objetivosDeAprendizagem")
    public String objetivosDeAprendizagem() {
        return "Nao surtar, manter a calma, revisar o conteudo";
    }
}
