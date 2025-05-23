package br.com.academy.wakanda.cadastro_saude.documento.domain;

import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;
import br.com.academy.wakanda.cadastro_saude.documento.application.api.DocumentoAlteracaoRequest;
import br.com.academy.wakanda.cadastro_saude.documento.application.api.DocumentoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition =  "UUID",name = "idDocumento",updatable = false, nullable = false,unique = true)
    private UUID idDocumento;
    @NotNull
    @Column(columnDefinition =  "UUID",name = "idBeneficiarioCadastrado", nullable = false)
    private UUID idBeneficiarioCadastrado;
    @NotBlank(message = "Informe o tipo do documento")
    private String tipoDocumento;
    @NotBlank(message = "Preenchimento obrigatório, descreva o tipo de documento")
    private String descricao;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;


    public Documento(UUID idBeneficiario,@Valid DocumentoRequest documentoRequest) {
        this.idBeneficiarioCadastrado = idBeneficiario;
        this.tipoDocumento = documentoRequest.getTipoDocumento();
        this.descricao = documentoRequest.getDescricao();
        this.dataInclusao = LocalDateTime.now();
    }


    public void alteraDocumentoComId(DocumentoAlteracaoRequest documentoRequest) {
        this.tipoDocumento = documentoRequest.getTipoDocumento();
        this.descricao = documentoRequest.getDescricao();
    }
}


