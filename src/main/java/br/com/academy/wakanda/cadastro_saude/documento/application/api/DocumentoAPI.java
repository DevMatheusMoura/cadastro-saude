package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioRequest;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/documento")
public interface DocumentoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DocumentoResponse postDocumento(@Valid @RequestBody DocumentoRequest documentoRequest);

    }
