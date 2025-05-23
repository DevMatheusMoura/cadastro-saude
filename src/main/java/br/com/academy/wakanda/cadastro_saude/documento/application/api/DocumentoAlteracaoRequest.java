package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;


@Value
public class DocumentoAlteracaoRequest {
        @NotBlank(message = "Informe o tipo do documento")
        private String tipoDocumento;
        @NotBlank(message = "Preenchimento obrigatório, descreva o tipo de documento")
        private String descricao;
}
