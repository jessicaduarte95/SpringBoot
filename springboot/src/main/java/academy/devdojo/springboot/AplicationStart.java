package academy.devdojo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration  // Para não dar problema no momento da inicialização da aplicação.
@ComponentScan(basePackages = "academy.devdojo.springboot") // Força a fazer o scan.
//@Configuration -> usada para segurança.
//@SpringBootApplication
public class AplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(AplicationStart.class, args); // O projeto é um projeto do Spring.
    }
}
