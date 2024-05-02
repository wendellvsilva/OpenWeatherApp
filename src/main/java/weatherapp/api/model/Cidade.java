package weatherapp.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import weatherapp.api.DTO.CidadeDTO;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cidade")
@Table(name = "cidades")
public class Cidade {

    @Id
    private String cidade;

    @Embedded
    private Clima clima;

    public Cidade(CidadeDTO cidadeDTO) {
        this.cidade = cidadeDTO.cidade();
        this.clima = new Clima(cidadeDTO.clima());
    }

}