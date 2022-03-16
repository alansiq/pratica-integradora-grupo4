package com.mercadolivre.grupo4.classes;


import com.mercadolivre.grupo4.Cliente;
//import com.mercadolivre.grupo4.Item;
import com.mercadolivre.grupo4.interfaces.Crud;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;

@Getter


public class Fatura {

    private Cliente cliente;
    private ArrayList<Item> itens;
    private BigDecimal totalCompra;

    public Fatura(Cliente cliente, ArrayList<Item> itens) {
        this.cliente = cliente;
        this.itens = itens;
        this.totalCompra = calculateTotalCompra();
    }

    public BigDecimal calculateTotalCompra(){
        BigDecimal soma = new BigDecimal(0);

        for (int i = 0; i<this.itens.size();i++){

            Item item = itens.get(i);
            BigDecimal custoUnitario = item.getCustoUnitario();
            BigDecimal quantidadeComprada = BigDecimal.valueOf(item.getQuantidadeComprada());
            soma = soma.add(custoUnitario.multiply(quantidadeComprada));
        }
        return soma;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", totalCompra=" + totalCompra +
                '}';
    }
}
