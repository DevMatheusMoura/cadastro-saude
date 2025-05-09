package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class BenefeciarioController implements BeneficiarioAPI {
    @Override
    public BeneficiarioResponse postBeneficiario(BeneficiarioRequest BeneficiarioRequest) {
        log.info("[inicia] BeneficiarioController.postBeneficiario");
        log.info("[finaliza] BeneficiarioController.postBeneficiario");
        return null;
    }
}
