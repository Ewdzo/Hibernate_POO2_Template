package org.example.entities;

import java.util.Date;

public class Transacao {
    int idTransacao;
    ContaBancaria conta;
    Cliente titular;
    double valor;
    String tipo;
    Date data;
}
