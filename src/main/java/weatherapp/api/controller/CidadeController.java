    package weatherapp.api.controller;

    import jakarta.validation.Valid;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import weatherapp.api.DTO.CidadeDTO;
    import weatherapp.api.model.Cidade;
    import weatherapp.api.repository.CidadeRepository;

    @RestController
    @RequestMapping("/cidades")
    public class CidadeController {
        @Autowired
        private CidadeRepository repository;
        @PostMapping
        public void cadastrar(@RequestBody @Valid CidadeDTO cidadeDTO){
            repository.save(new Cidade(cidadeDTO));


        }
    }
