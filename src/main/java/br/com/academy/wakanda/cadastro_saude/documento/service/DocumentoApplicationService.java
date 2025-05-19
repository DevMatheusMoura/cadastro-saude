package br.com.academy.wakanda.cadastro_saude.documento.service;

import br.com.academy.wakanda.cadastro_saude.documento.application.api.DocumentoRequest;
import br.com.academy.wakanda.cadastro_saude.documento.application.api.DocumentoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
    @Override
    public DocumentoResponse criaDocumento(DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoApplicationService.criaDocumento");
        log.info("[finaliza] DocumentoApplicationService.criaDocumento");
        return documentoRequest
    }
}
