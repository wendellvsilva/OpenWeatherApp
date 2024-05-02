    package weatherapp.api.controller;

    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import weatherapp.api.DTO.CidadeDTO;
    import weatherapp.api.DTO.DadosCadastroCidade;

    @RestController
    @RequestMapping("/cidade")
    public class CidadeController {

        @PostMapping
        public void cadastrar(@RequestBody CidadeDTO cidadeDTO){
            System.out.println(cidadeDTO);

        }
    }
