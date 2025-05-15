package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.service;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioDetalhadoResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioListResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioRequest;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.repository.BeneficiarioRepository;
import br.com.academy.wakanda.cadastro_saude.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {
    private final BeneficiarioRepository beneficiarioRepository;

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService.criaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.salva( new Beneficiario(beneficiarioRequest));
        log.info("[finaliza] BeneficiarioApplicationService.criaBeneficiario");
        return BeneficiarioResponse.builder()
                .idBeneficiario(beneficiario.getIdBeneficiario())
                .build();
    }

    @Override
    public List<BeneficiarioListResponse> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioApplicationService.buscaTodosBeneficiarios");
        List<Beneficiario> beneficiarios = beneficiarioRepository.buscaTodosBeneficiarios();
        log.info("[finaliza] BeneficiarioApplicationService.buscaTodosBeneficiarios");
        return BeneficiarioListResponse.converte(beneficiarios);
    }

    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService.buscaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiario(idBeneficiario);
        log.info("[finaliza] BeneficiarioApplicationService.buscaTodosBeneficiarios");
        return new BeneficiarioDetalhadoResponse(beneficiario);
    }

    @Override
    public void deletaBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService.deletaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiario(idBeneficiario);
        beneficiarioRepository.deleta(beneficiario);
        log.info("[finaliza] BeneficiarioApplicationService.deletaBeneficiario");
    }

    @Override
    public void editaBeneficiario(UUID idBeneficiario, BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService.editaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiario(idBeneficiario);
        beneficiario.atualiza(beneficiarioRequest);
        beneficiarioRepository.salva(beneficiario);
        log.info("[finaliza] BeneficiarioApplicationService.editaBeneficiario");
    }
}

