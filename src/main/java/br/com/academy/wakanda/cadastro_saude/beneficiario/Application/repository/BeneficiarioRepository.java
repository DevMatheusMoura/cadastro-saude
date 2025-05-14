package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.repository;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioListResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
    List<Beneficiario> buscaTodosBeneficiarios();
    Beneficiario buscaBeneficiario(UUID idBeneficiario);
}
