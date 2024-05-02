package weatherapp.api.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import weatherapp.api.model.SituacaoClima;
import weatherapp.api.model.Turno;

public record ClimaDTO(
        @NotNull
        SituacaoClima situacaoClima,
        @NotNull
        Turno turno,
        @NotBlank
        String data,
        @NotNull
        @Positive
        String umidade,
        @NotNull
        @Positive
        String precipitacao,

        @NotNull
        @Positive
        String temperatura,

        @NotNull
        @Positive
        String velVento
) {
}