package br.com.academy.wakanda.cadastro_saude.beneficiario.infra;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.repository.BeneficiarioRepository;
import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;
import br.com.academy.wakanda.cadastro_saude.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
    private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository.salva");
        beneficiarioSpringDataJPARepository.save(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository.salva");
        return beneficiario;
    }

    @Override
    public List<Beneficiario> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioInfraRepository.buscaTodosBeneficiarios");
        List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
        log.info("[inicia] BeneficiarioInfraRepository.buscaTodosBeneficiarios");
        return todosBeneficiarios;
    }

    @Override
    public Beneficiario buscaBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository.buscaBeneficiario");
        Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Beneficiario não encontrado"));
        log.info("[finaliza] BeneficiarioInfraRepository.buscaBeneficiario");
        return beneficiario;

    }

    @Override
    public void deleta(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository.buscaBeneficiario");
        beneficiarioSpringDataJPARepository.delete(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository.buscaBeneficiario");
    }
}
