package weatherapp.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import weatherapp.api.DTO.CidadeDTO;


@Embeddable
@Table(name = "cidades")
@Entity(name = "Cidade")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cidade {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    @Embedded
    private Clima clima;


    public Cidade(CidadeDTO cidadeDTO) {
        this.nome = cidadeDTO.nome();
        this.clima = new Clima(cidadeDTO.clima());

    }
}
