package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;

import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
        return null;
    }
}
