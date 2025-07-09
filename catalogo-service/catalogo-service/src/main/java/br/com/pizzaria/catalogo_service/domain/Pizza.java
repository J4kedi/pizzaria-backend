package br.com.pizzaria.catalogo_service.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pizza {
    @Id
    private Long id;
    private String nome;
    private String descricao;
    private int preco;
    private String urlImagem;
}
