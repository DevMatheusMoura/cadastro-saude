package br.com.academy.wakanda.cadastro_saude.beneficiario.domain;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioRequest;
import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(columnDefinition = "UUID",name = "idBeneficiario",updatable = false, nullable = false,unique = true)
    private UUID idBeneficiario;
    @NotBlank(message = "Informe o seu nome completo")
    private String nomeCompleto;
    @CPF
    private String cpf;
    @NotBlank(message = "Informe um telefone válido com o DDD")
    private String telefone;
    @NotNull(message = "Informe a sua data de nascimento")
    private LocalDate dataNascimento;


    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;



    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
        this.nomeCompleto = beneficiarioRequest.getNomeCompleto();
        this.telefone = beneficiarioRequest.getTelefone();
        this.dataNascimento = beneficiarioRequest.getDataNascimento();
        this.dataAtualizacao = LocalDateTime.now();
        this.dataInclusao = LocalDateTime.now();
    }

    public void atualiza(BeneficiarioRequest beneficiarioRequest) {
        this.nomeCompleto = beneficiarioRequest.getNomeCompleto();
        this.telefone = beneficiarioRequest.getTelefone();
        this.dataNascimento = beneficiarioRequest.getDataNascimento();
        this.dataAtualizacao = LocalDateTime.now();
    }
}
