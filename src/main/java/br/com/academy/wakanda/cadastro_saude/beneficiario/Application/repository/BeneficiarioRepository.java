package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.repository;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioListResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;

import java.util.List;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
    List<Beneficiario> buscaTodosBeneficiarios();

}
