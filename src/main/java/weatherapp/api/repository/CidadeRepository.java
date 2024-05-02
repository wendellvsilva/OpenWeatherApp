package weatherapp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weatherapp.api.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
