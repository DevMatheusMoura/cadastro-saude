package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.service;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioDetalhadoResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioListResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioRequest;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioResponse;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
    List<BeneficiarioListResponse> buscaTodosBeneficiarios();
    BeneficiarioDetalhadoResponse buscaBeneficiario(UUID idBeneficiario);
    void  deletaBeneficiario(UUID idBeneficiario);
}
