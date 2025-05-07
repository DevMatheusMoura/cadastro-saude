package br.com.academy.wakanda.cadastro_saude.beneficiario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Beneficiario {
    @Id
    private UUID idBeneficiario;
    @NotBlank(message = "Informe o seu nome completo")
    private String nomeCompleto;
    @NotBlank(message = "Informe um telefone válido com o DDD")
    private String telefone;
    @NotNull(message = "Informe a sua data de nascimento")
    private LocalDate dataNascimento;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Beneficiario(UUID idBeneficiario, String nomeCompleto, String telefone,
                        LocalDate dataNascimento, LocalDate dataInclusao, LocalDateTime dataAtualizacao, LocalDateTime dataAtualizacao1) {
        this.idBeneficiario = idBeneficiario;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAtualizacao = LocalDateTime.now();
        this.dataInclusao = LocalDateTime.now();
    }
}
