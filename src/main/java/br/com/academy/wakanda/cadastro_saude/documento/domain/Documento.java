package br.com.academy.wakanda.cadastro_saude.documento.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private UUID idDocumento;
    @NotBlank(message = "Informe o tipo do documento")
    private String tipoDocumento;
    @NotBlank(message = "Preenchimento obrigatório, descreva o tipo de documento")
    private String descricao;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Documento(UUID idDocumento, String tipoDocumento, String descricao,
                     LocalDate dataInclusao, LocalDate dataAtualizacao) {
        this.idDocumento = UUID.randomUUID();
        this.tipoDocumento = tipoDocumento;
        this.descricao = descricao;
        this.dataInclusao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }
}
