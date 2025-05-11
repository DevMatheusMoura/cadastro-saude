package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;

import java.time.LocalDate;
import java.util.UUID;

public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;
}
