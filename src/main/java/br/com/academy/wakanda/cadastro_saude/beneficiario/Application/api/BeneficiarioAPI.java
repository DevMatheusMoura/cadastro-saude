package br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest BeneficiarioRequest);
}
