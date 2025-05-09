package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.service;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioRequest;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BeneficiarioApplicationService implements BeneficiarioService {
    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService.criaBeneficiario");
        log.info("[finaliza] BeneficiarioApplicationService.criaBeneficiario");
        return null;
    }
}
