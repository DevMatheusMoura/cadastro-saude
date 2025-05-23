package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class DocumentoListResponse {
    private UUID idDocumento;
    private String tipoDocumento;
    private String descricao;


    public static List<DocumentoListResponse> converte(List<Documento> documentos) {
        return documentos.stream()
                .map(DocumentoListResponse::new)
                .collect(Collectors.toList());
    }

    public DocumentoListResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
    }
}
