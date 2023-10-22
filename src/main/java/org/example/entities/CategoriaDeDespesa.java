package org.example.entities;

import jakarta.persistence.Id;

public class CategoriaDeDespesa {

    @Id
    String categoria;

    double imposto;

    CategoriaDeDespesa(String categoria, double imposto) {
        this.categoria = categoria;
        this.imposto = imposto;
    };

}
