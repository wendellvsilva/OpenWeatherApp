package weatherapp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weatherapp.api.model.Cidade;

import java.util.Optional;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    Optional<Cidade> findByCidade(String nome);
}
