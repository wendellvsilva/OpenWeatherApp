    package weatherapp.api.controller;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import weatherapp.api.DTO.CidadeDTO;
    import weatherapp.api.DTO.DadosCadastroCidade;
    import weatherapp.api.model.Cidade;
    import weatherapp.api.model.Clima;
    import weatherapp.api.repository.CidadeRepository;

    @RestController
    @RequestMapping("/cidade")
    public class CidadeController {
        @Autowired
        private CidadeRepository repository;
        @PostMapping
        public void cadastrar(@RequestBody CidadeDTO cidadeDTO){
            repository.save(new Cidade(cidadeDTO));


        }
    }
