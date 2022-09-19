package academy.devdojo.springboot.controller;

import academy.devdojo.springboot.domain.Anime;
import academy.devdojo.springboot.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController // Diz que a classe é um controller.
@RequestMapping("anime")
@Log4j2
//@AllArgsConstructor -> cria um construtor com todos os atributos que se tem na classe.
//@RequiredArgsConstructor -> cria um construtor com os campos que são finais.
public class AnimeController {
//    @Autowired
    private DateUtil dateUtil;

    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    // Equivalente: localhost:8080/anime/list
    //@RequestMapping(method = RequestMethod.GET, path = "list") // Exite uma forma melhor de se fazer.
    @GetMapping(path = "list") // Forma melhor de se fazer.
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
