package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;

import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Value
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
        return beneficiarios.stream()
                .map(BeneficiarioListResponse::new)
                .toList();
    }

    private BeneficiarioListResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nomeCompleto = beneficiario.getNomeCompleto();
        this.cpf = beneficiario.getCpf();
        this.telefone = beneficiario.getTelefone();
        this.dataNascimento = beneficiario.getDataNascimento();
    }
}
