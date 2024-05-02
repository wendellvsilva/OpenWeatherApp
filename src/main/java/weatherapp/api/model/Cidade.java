package weatherapp.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import weatherapp.api.DTO.CidadeDTO;
import weatherapp.api.DTO.CidadeUpdateDTO;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cidade")
public class Cidade {

    @Id
    private String cidade;

    @Embedded
    private Clima clima;

    public Cidade(CidadeDTO cidadeDTO) {
        this.cidade = cidadeDTO.cidade();
        this.clima = new Clima(cidadeDTO.clima());
    }

    public void atualizarInfo(CidadeUpdateDTO cidadeDTO) {
        if(cidadeDTO.temperatura() != null)
            this.clima.setTemperatura(cidadeDTO.temperatura());
    }

}