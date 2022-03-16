package com.mercadolivre.grupo4;

import java.util.*;
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

        System.out.println("------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ID do cliente: ");
        try {
            long idCliente = scan.nextLong();

            Optional<Cliente> infoCliente = clientes.stream().filter(cliente -> cliente.getId() == idCliente).findAny();

            System.out.println(infoCliente.get().toString());
        } catch (InputMismatchException e) {
            System.out.println("Digite um ID de cliente válido.");
        } catch (NoSuchElementException e) {
            System.out.println("ID não encontrado.");
        }

    }
}
