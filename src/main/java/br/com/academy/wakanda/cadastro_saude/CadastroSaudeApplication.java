package br.com.academy.wakanda.cadastro_saude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class CadastroSaudeApplication {

	@GetMapping
	public String getHomTeste() {
		return "Cadastro Saude - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(CadastroSaudeApplication.class, args);
	}

}
