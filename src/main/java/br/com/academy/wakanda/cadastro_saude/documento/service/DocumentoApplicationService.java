package br.com.academy.wakanda.cadastro_saude.documento.service;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioListResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.service.BeneficiarioService;
import br.com.academy.wakanda.cadastro_saude.documento.application.api.*;
import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
    private final BeneficiarioService beneficiarioService;
    private final DocumentoRepository documentoRepository;

    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoApplicationService.criaDocumento");
        beneficiarioService.buscaBeneficiario(idBeneficiario);
        Documento documento = documentoRepository.salvaDocumento(new Documento(idBeneficiario, documentoRequest));
        log.info("[finaliza] DocumentoApplicationService.criaDocumento");
        return  new DocumentoResponse(documento.getIdDocumento());
    }

    @Override
    public List<DocumentoListResponse> buscaTodosDocumentos(UUID idBeneficiario) {
        log.info("[inicia] DocumentoApplicationService.buscaTodosDocumentos");
        beneficiarioService.buscaBeneficiario(idBeneficiario);
        List<Documento> documentos = documentoRepository.buscaTodosDocumentos(idBeneficiario);
        log.info("[finaliza] DocumentoApplicationService.buscaTodosDocumentos");
        return DocumentoListResponse.converte(documentos);
    }

    @Override
    public DocumentoDetalhadoResponse buscaDocumentoComId(UUID idBeneficiario, UUID idDocumento) {
        log.info("[inicia] DocumentoApplicationService.buscaDocumentoComId");
        beneficiarioService.buscaBeneficiario(idBeneficiario);
        Documento documento = documentoRepository.buscaDocumentoComId(idDocumento);
        log.info("[finaliza] DocumentoApplicationService.buscaDocumentoComId");
        return new DocumentoDetalhadoResponse(documento);
    }

    @Override
    public void alteraDocumentoComId(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[inicia] DocumentoApplicationService.AlteraDocumentoComId");
        beneficiarioService.buscaBeneficiario(idBeneficiario);
        Documento documento = documentoRepository.buscaDocumentoComId(idDocumento);
        documento.alteraDocumentoComId(documentoAlteracaoRequest);
        documentoRepository.salvaDocumento(documento);
        log.info("[finaliza] DocumentoApplicationService.AlteraDocumentoComId");

    }


}

