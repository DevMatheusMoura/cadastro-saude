package br.com.academy.wakanda.cadastro_saude.infra;

import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;
import br.com.academy.wakanda.cadastro_saude.documento.service.DocumentoRepository;
import br.com.academy.wakanda.cadastro_saude.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository.salva");
        documentoSpringDataJPARepository.save(documento);
        log.info("[finaliza] DocumentoInfraRepository.salva");
        return documento;
    }

    @Override
    public List<Documento> buscaTodosDocumentos(UUID idBeneficiario) {
        log.info("[inicia] DocumentoInfraRepository.buscaTodosDocumentos");
        var todosDocumentos = documentoSpringDataJPARepository.findAllByIdBeneficiarioCadastrado(idBeneficiario);
        log.info("[finaliza] DocumentoInfraRepository.buscaTodosDocumentos");
        return todosDocumentos;
    }

    @Override
    public Documento buscaDocumentoComId(UUID idDocumento) {
        log.info("[inicia] DocumentoInfraRepository.buscaDocumentoComId");
        var documento = documentoSpringDataJPARepository.findById(idDocumento)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Documento não encontrado para o Id = " + idDocumento));
        log.info("[finaliza] DocumentoInfraRepository.buscaDocumentoComId");
        return documento;
    }
}
