package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // Gera o construtor com todos os valores.
public class Anime {
    private Long id;
    private String name;
}
