package weatherapp.api.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import weatherapp.api.DTO.ClimaDTO;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Clima {

    @Enumerated(EnumType.STRING)
    private SituacaoClima situacaoClima;
    @Enumerated(EnumType.STRING)
    private Turno turno;
    private String data;

    private int umidade;
    private int precipitacao;
    private int velVento;

    public Clima(ClimaDTO clima) {

        this.data = clima.data();
        this.turno = clima.turno();
        this.situacaoClima = clima.situacaoClima();
        this.umidade = clima.umidade();
        this.precipitacao = clima.precipitacao();
        this.velVento = clima.velVento();
    }
}
