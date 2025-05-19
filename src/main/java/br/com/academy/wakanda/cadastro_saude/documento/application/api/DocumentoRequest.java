package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import br.com.academy.wakanda.cadastro_saude.documento.domain.TipoDocumento;
import jakarta.validation.constraints.NotBlank;

public class DocumentoRequest {
    @NotBlank(message = "Informe o tipo do documento")
    private TipoDocumento tipoDocumento;
    @NotBlank(message = "Preenchimento obrigatório, descreva o tipo de documento")
    private String descricao;
}
