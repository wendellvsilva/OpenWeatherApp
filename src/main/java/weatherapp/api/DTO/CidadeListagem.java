package weatherapp.api.DTO;

import weatherapp.api.model.Cidade;
import weatherapp.api.model.Clima;

public record CidadeListagem(String cidade, Clima clima) {

    public CidadeListagem(Cidade cidade){
        this(cidade.getCidade(), cidade.getClima());
    }
}
