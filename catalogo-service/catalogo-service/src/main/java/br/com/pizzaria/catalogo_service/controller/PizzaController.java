package br.com.pizzaria.catalogo_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pizzaria.catalogo_service.domain.Pizza;
import br.com.pizzaria.catalogo_service.repository.PizzaRepository;

@RestController
@RequestMapping("/api/pizza")
@CrossOrigin(origins = "https://localhost:4200")
public class PizzaController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping
    public List<Pizza> getPizzas() {
        return pizzaRepository.findAll();
    }
}
