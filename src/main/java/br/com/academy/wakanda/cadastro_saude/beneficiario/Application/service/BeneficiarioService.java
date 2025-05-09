package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.service;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioRequest;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioResponse;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}
