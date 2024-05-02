package weatherapp.api.DTO;

import jakarta.validation.constraints.NotBlank;


public record CidadeUpdateDTO(
        @NotBlank
        String cidade,
        String temperatura) {
}
