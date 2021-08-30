package com.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.empresa.controller","MedicamentoRestController","MedicamentoService"})
public class Sesion01InicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sesion01InicioApplication.class, args);
	}

}
