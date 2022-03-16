package com.mercadolivre.grupo4.repository;

import com.mercadolivre.grupo4.Cliente;
import com.mercadolivre.grupo4.interfaces.Crud;
import lombok.Getter;

import java.util.LinkedList;
import java.util.Optional;

@Getter
public class ClienteRepository implements Crud<Cliente> {

     LinkedList<Cliente> listaClientes = new LinkedList<>();

    @Override
    public void create(Cliente cliente) {
        listaClientes.add(cliente);

    }

    @Override
    public Cliente read(Cliente o) {
        return null;
    }

    @Override
    public Cliente update(Cliente o) {
        return null;
    }

    @Override
    public void delete(Cliente o) {

    }

    public boolean verificaIdCliente(long id){
        return listaClientes.stream().filter(cliente -> cliente.getId() == id).findAny().isPresent();
    }

}
