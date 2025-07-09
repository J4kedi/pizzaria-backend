package br.com.pizzaria.catalogo_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.pizzaria.catalogo_service.domain.Pizza;
import br.com.pizzaria.catalogo_service.repository.PizzaRepository;

@SpringBootApplication
public class CatalogoServiceApplication implements CommandLineRunner {
	@Autowired
	private PizzaRepository pizzaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CatalogoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pizza p1 = new Pizza();
        p1.setId(1L);
        p1.setNome("Calabresa");
        p1.setPreco(19);
        p1.setUrlImagem("");

        Pizza p2 = new Pizza();
        p2.setId(2L);
        p2.setNome("4 Queijos");
        p2.setPreco(29);
        p2.setUrlImagem("");

        pizzaRepository.saveAll(List.of(p1, p2));
	}

}
