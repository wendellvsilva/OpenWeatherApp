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
@EqualsAndHashCode(of = "nome")
public class Cidade {

    @Id
    private String nome;

    @Embedded
    private Clima clima;

    public Cidade(CidadeDTO cidadeDTO) {
        this.nome = cidadeDTO.nome();
        this.clima = new Clima(cidadeDTO.clima());
    }
}