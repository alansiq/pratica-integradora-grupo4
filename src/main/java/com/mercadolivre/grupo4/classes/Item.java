package com.mercadolivre.grupo4.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@NoArgsConstructor

public class Item {

    private long codigoProduto;
    private String nomeProduto;
    private int quantidadeComprada;
    private BigDecimal custoUnitario;

    @Override
    public String toString() {
        return "Item{" +
                "codigoProduto=" + codigoProduto +
                " nomeProduto='" + nomeProduto + '\'' +
                ", quantidadeComprada=" + quantidadeComprada +
                ", custoUnitario=" + custoUnitario +
                "}";
    }
}


