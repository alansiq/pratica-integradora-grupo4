package com.mercadolivre.grupo4;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;

@AllArgsConstructor
@Getter

public class Fatura {

    private Cliente cliente;
    private ArrayList<Item> itens;
    private BigDecimal totalCompra;

}
