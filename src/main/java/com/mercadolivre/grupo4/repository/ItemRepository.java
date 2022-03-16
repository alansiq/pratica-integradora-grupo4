package com.mercadolivre.grupo4.repository;

import com.mercadolivre.grupo4.classes.Item;
import com.mercadolivre.grupo4.interfaces.Crud;
import lombok.Getter;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Getter
public class ItemRepository implements Crud <Item> {

    ArrayList<Item> listaItens = new ArrayList<>();

    @Override
    public void create(Item item) {
        listaItens.add(item);
    }

    @Override
    public void read() {
        String collect = listaItens.stream().map(cliente -> cliente.toString()).collect(Collectors.joining(",\n"));
        System.out.println(collect);
    }

    @Override
    public Item update(Item o) {
        return null;
    }

    @Override
    public void delete(Item o) {

    }
}
