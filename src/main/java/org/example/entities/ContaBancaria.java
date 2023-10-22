package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ContaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idConta;
    
    @OneToOne
    Cliente titular;
    
    double saldo;

    public ContaBancaria(Cliente titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    };
}
