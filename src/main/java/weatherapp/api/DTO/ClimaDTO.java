package weatherapp.api.DTO;

import weatherapp.api.model.SituacaoClima;
import weatherapp.api.model.Turno;

public record ClimaDTO(SituacaoClima situacaoClima,
                       Turno turno,
                       String data,
                       int umidade,
                       int precipitacao,
                       int velVento
) {
}
