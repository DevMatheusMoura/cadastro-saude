package br.com.academy.wakanda.cadastro_saude.beneficiario.infra;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.repository.BeneficiarioRepository;
import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository.salva");
        beneficiarioSpringDataJPARepository.salva(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository.salva");
        return beneficiario;
    }
}
