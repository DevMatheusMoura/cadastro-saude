package br.com.academy.wakanda.cadastro_saude.documento.application.api;

import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioDetalhadoResponse;
import br.com.academy.wakanda.cadastro_saude.beneficiario.Application.api.BeneficiarioListResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario,
                                    @Valid @RequestBody DocumentoRequest documentoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<DocumentoListResponse> getTodosDocumentos(@PathVariable UUID idBeneficiario);

    @GetMapping(value = "/{idDocumento}")
    @ResponseStatus(code = HttpStatus.OK)
    DocumentoDetalhadoResponse getDocumentoComId(@PathVariable UUID idBeneficiario,
                                                  @PathVariable UUID idDocumento);

    @PatchMapping(value = "/{idDocumento}")
    @ResponseStatus(HttpStatus.CREATED)
    void patchDocumento(@PathVariable UUID idBeneficiario,@PathVariable UUID idDocumento,
                                    @Valid @RequestBody DocumentoAlteracaoRequest documentoAlteracaoRequest);


}
