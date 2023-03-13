package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	@GetMapping("/hello")
	public String Hello() {
		return "Hello World!";
	}
	@RequestMapping("/bsms")
	@GetMapping("/bsms")
	public String Bsm(){
		return "Bsm´s\n" +
		"<br/>- Persistência" +
		"<br/>- Mentalidade de Crescimento" +
		"<br/>- Orientação ao Futuro" + 
		"<br/>- Responsabilidade Pessoal" + 
		"<br/>- Trabalho em Equipe" +
		"<br/>- Comunicação" +
		"<br/>- Comunicação Não Violenta" + 
		"<br/>- Atenção para Detalhes" +
		"<br/>- Proatividade";
	}
	@RequestMapping("/obsemana")
	@GetMapping("/obsemana")
	public String Objetivos(){
		return "Objetivos da semana:\n" +
		"<br/>- Aprender SpringBoot" +
		"<br/>- Estudar mais MySQL" +
		"<br/>- Desenvolver API's" + 
		"<br/>- Montar um set de Techno para mixar fim de semana" + 
		"<br/>- Manter rotina de exercicios" +
		"<br/>- Intalar Traktor no PC";
	}

}
