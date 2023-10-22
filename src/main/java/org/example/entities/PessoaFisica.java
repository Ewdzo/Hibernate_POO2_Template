package org.example.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PessoaFisica extends Cliente {  

    @Column(nullable=false, unique = true) 
    long CPF;

    String nome;
    Date dataDeNascimento;

    PessoaFisica(String nome, Date dataDeNascimento) {
        super();
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    };
};
