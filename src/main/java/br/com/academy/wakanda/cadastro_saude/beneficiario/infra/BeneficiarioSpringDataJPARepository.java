package br.com.academy.wakanda.cadastro_saude.beneficiario.infra;

import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeneficiarioSpringDataJPARepository extends JpaRepository<Beneficiario, UUID> {
}
