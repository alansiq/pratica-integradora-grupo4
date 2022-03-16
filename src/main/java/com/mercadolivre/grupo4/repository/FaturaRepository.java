package com.mercadolivre.grupo4.repository;

import com.mercadolivre.grupo4.Cliente;
import com.mercadolivre.grupo4.classes.Fatura;
import com.mercadolivre.grupo4.interfaces.Crud;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;

public class FaturaRepository implements Crud <Fatura> {

    ArrayList<Fatura> listaFaturas = new ArrayList<>();
    // ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public void create(Fatura fatura) {
        listaFaturas.add(fatura);
    }

    @Override
    public Fatura read(Fatura o) {
        return null;
    }

    @Override
    public Fatura update(Fatura o) {
        return null;
    }

    @Override
    public void delete(Fatura o) {

    }

    public void criarFatura(Fatura fatura, ClienteRepository listaClientes){
        if ((listaClientes.verificaIdCliente(fatura.getCliente().getId()))){
            create(fatura);
        }else {
            System.out.println("adicionando cliente na lista");
            listaClientes.create(fatura.getCliente());

        }
    }
}
