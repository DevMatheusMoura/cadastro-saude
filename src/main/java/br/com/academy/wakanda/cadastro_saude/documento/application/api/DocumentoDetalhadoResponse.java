package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class DocumentoDetalhadoResponse {
    private UUID idDocumento;
    private String tipoDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;


    public DocumentoDetalhadoResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
        this.dataInclusao = documento.getDataInclusao();
    }
}
