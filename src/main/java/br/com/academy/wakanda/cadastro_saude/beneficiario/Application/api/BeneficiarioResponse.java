package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;
import lombok.Builder;
import lombok.Value;
import java.util.UUID;

@Value
@Builder
public class BeneficiarioResponse {
    private UUID idBeneficiario;
}
