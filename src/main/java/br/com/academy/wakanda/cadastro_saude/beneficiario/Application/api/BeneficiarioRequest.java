package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Value
public class BeneficiarioRequest {
    @NotBlank(message = "Informe o seu nome completo")
    private String nomeCompleto;
    @CPF
    @NotBlank(message = "Informe o CPF")
    private String cpf;
    @NotBlank(message = "Informe um telefone válido com o DDD")
    private String telefone;
    @NotNull(message = "Informe a sua data de nascimento")
    private LocalDate dataNascimento;

}
