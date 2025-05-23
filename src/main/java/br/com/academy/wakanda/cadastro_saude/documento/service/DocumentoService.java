package br.com.academy.wakanda.cadastro_saude.documento.service;

import br.com.academy.wakanda.cadastro_saude.documento.application.api.*;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);
    List<DocumentoListResponse> buscaTodosDocumentos(UUID idBeneficiario);
    DocumentoDetalhadoResponse buscaDocumentoComId(UUID idBeneficiario, UUID idDocumento);
    void alteraDocumentoComId(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest);
}
