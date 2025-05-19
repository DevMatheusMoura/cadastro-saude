package br.com.academy.wakanda.cadastro_saude.documento.service;

import br.com.academy.wakanda.cadastro_saude.documento.application.api.DocumentoRequest;
import br.com.academy.wakanda.cadastro_saude.documento.application.api.DocumentoResponse;

public interface DocumentoService {
    DocumentoResponse criaDocumento(DocumentoRequest documentoRequest);
}
