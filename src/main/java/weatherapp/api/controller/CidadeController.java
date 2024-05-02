    package weatherapp.api.controller;

    import jakarta.transaction.Transactional;
    import jakarta.validation.Valid;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.Pageable;
    import org.springframework.data.web.PageableDefault;
    import org.springframework.web.bind.annotation.*;
    import weatherapp.api.DTO.CidadeDTO;
    import weatherapp.api.DTO.CidadeListagem;
    import weatherapp.api.DTO.CidadeUpdateDTO;
    import weatherapp.api.model.Cidade;
    import weatherapp.api.repository.CidadeRepository;

    import java.util.Optional;

    @RestController
    @RequestMapping("/cidades")
    public class CidadeController {
        @Autowired
        private CidadeRepository repository;

        @PostMapping
        @Transactional
        public void cadastrar(@RequestBody @Valid CidadeDTO cidadeDTO) {
            repository.save(new Cidade(cidadeDTO));
        }
        @GetMapping
        public Page<CidadeListagem> listar(@PageableDefault(size = 10, sort = {"cidade"}) Pageable pagina) {
        return repository.findAll(pagina).map(CidadeListagem::new);
            }


        @DeleteMapping("/{nome}")
        @Transactional
        public void deletarPorNome(@PathVariable("nome") String nome) {
            Optional<Cidade> cidadeOptional = repository.findByCidade(nome);
            cidadeOptional.ifPresent(repository::delete);
        }

    }

