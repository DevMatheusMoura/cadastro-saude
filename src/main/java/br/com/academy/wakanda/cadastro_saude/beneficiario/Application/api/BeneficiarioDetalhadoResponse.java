package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;

import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class BeneficiarioDetalhadoResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;

    public BeneficiarioDetalhadoResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nomeCompleto = beneficiario.getNomeCompleto();
        this.cpf = beneficiario.getCpf();
        this.telefone = beneficiario.getTelefone();
        this.dataNascimento = beneficiario.getDataNascimento();
    }
}
