package org.example.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transacao {
    @Id
    int idTransacao;

    @ManyToOne
    ContaBancaria conta;

    @ManyToOne
    Cliente titular;
    
    double valor;
    String tipo;
    Date data;

    Transacao(int idTransacao, ContaBancaria conta, Cliente titular, double valor, String tipo, Date data){
        this.idTransacao = idTransacao;
        this.conta = conta;
        this.titular = titular;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }
}
