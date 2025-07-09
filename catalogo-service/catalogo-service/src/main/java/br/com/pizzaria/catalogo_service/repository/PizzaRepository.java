package br.com.pizzaria.catalogo_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pizzaria.catalogo_service.domain.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {}