package com.mercadolivre.grupo4;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1L, "Marianna", "Rodrigues");
        Cliente cliente2 = new Cliente(2L, "Hugo", "Fellipe");
        Cliente cliente3 = new Cliente(3L, "Alan", "Siqueira");

        LinkedList<Cliente> clientes = new LinkedList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        String collect = clientes.stream().map(cliente -> cliente.toString()).collect(Collectors.joining(",\n"));
        System.out.println(collect);

        clientes.remove(cliente1);

        collect = clientes.stream().map(cliente -> cliente.toString()).collect(Collectors.joining(",\n"));
        System.out.println("------------------------------------------");
        System.out.println(collect);



    }
}
