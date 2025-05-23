package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;
import br.com.academy.wakanda.cadastro_saude.documento.service.DocumentoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {
    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController.postDocumento");
        log.info("[idBeneficiario] {}", idBeneficiario);
        DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, documentoRequest);
        log.info("[finaliza] DocumentoController.postDocumento");
        return documento;
    }

    @Override
    public List<DocumentoListResponse> getTodosDocumentos(@PathVariable UUID idBeneficiario) {
        log.info("[inicia] DocumentoController.listarTodosDocumentos");
        log.info("[idBeneficiario] {}", idBeneficiario);
        List<DocumentoListResponse> documentos = documentoService.buscaTodosDocumentos(idBeneficiario);
        log.info("[finaliza] DocumentoController.listarTodosDocumentos");
        return documentos;

    }

    @Override
    public DocumentoDetalhadoResponse getDocumentoComId( UUID idBeneficiario, UUID idDocumento) {
        log.info("[inicia] DocumentoController.getDocumentoComId");
        log.info("[idBeneficiario] {} - [idDocumento] {}", idBeneficiario, idDocumento);
        DocumentoDetalhadoResponse documento = documentoService.buscaDocumentoComId(idBeneficiario, idDocumento);
        log.info("[finaliza] DocumentoController.getDocumentoComId");
        return documento;
    }

    @Override
    public void patchDocumento(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[inicia] DocumentoController.patchDocumento");
        log.info("[idBeneficiario] {} - [idDocumento] {}", idBeneficiario, idDocumento);
        documentoService.alteraDocumentoComId(idBeneficiario, idDocumento, documentoAlteracaoRequest);
        log.info("[finaliza] DocumentoController.patchDocumento");
    }


}
