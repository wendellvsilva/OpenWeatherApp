package weatherapp.api.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record  CidadeDTO(
        @NotBlank
        String nome,
        @Valid
        ClimaDTO clima
) {

}