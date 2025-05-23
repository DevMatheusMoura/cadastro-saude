package br.com.academy.wakanda.cadastro_saude.infra;

import br.com.academy.wakanda.cadastro_saude.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DocumentoSpringDataJPARepository extends JpaRepository <Documento, UUID> {
    List<Documento> findAllByIdBeneficiarioCadastrado(UUID idBeneficiario);
}
