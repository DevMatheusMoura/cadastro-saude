package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import br.com.academy.wakanda.cadastro_saude.documento.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController {
    DocumentoService documentoService;

    public DocumentoResponse postDocumento(DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController.postDocumento");
        DocumentoResponse documentoCriado = documentoService.criaDocumento(documentoRequest);
        log.info("[finaliza] DocumentoController.postDocumento");
        return documentoCriado;

    }
}
