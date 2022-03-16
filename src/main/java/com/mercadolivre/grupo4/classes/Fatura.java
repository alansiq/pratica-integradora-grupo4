package com.mercadolivre.grupo4.classes;


import com.mercadolivre.grupo4.Cliente;
//import com.mercadolivre.grupo4.Item;
import com.mercadolivre.grupo4.interfaces.Crud;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@NoArgsConstructor

public class Fatura {

    private Cliente cliente;
    private ArrayList<Item> itens;
    private BigDecimal totalCompra;

//    public BigDecimal calculateTotal()


}
