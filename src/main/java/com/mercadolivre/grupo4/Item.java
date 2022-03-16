package com.mercadolivre.grupo4;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter

public class Item {

    private long codigoProduto;
    private String nomeProduto;
    private int quantidadeComprada;
    private BigDecimal custoUnitario;

}
