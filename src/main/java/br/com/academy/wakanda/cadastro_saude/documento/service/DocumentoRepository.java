package br.com.academy.wakanda.cadastro_saude.documento.service;

import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);
    List<Documento> buscaTodosDocumentos(UUID idBeneficiario);
    Documento buscaDocumentoComId(UUID idDocumento);
}
