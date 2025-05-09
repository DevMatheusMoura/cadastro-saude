package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.repository;

import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
}
