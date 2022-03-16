package com.mercadolivre.grupo4;

import com.mercadolivre.grupo4.Cliente;
import com.mercadolivre.grupo4.classes.Fatura;
import com.mercadolivre.grupo4.classes.Item;
import com.mercadolivre.grupo4.repository.ClienteRepository;
import com.mercadolivre.grupo4.repository.FaturaRepository;
import com.mercadolivre.grupo4.repository.ItemRepository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ClienteRepository clienteRepository = new ClienteRepository();
        ItemRepository itemRepository = new ItemRepository();
        FaturaRepository faturaRepository = new FaturaRepository();

        Cliente cliente1 = new Cliente(1L, "Marianna", "Rodrigues");
        Cliente cliente2 = new Cliente(2L, "Hugo", "Fellipe");
        Cliente cliente3 = new Cliente(3L, "Alan", "Siqueira");

        clienteRepository.create(cliente1);
        clienteRepository.create(cliente2);
        clienteRepository.create(cliente3);

        System.out.println("printando clientes");
        clienteRepository.read();



        Item item1 = new Item(1L, "tomate", 10, new BigDecimal(2.00));
        Item item2 = new Item(2L, "cenoura", 12, new BigDecimal(0.50));
        Item item3 = new Item(3L, "alface", 2, new BigDecimal(3.50));
        Item item4 = new Item(4L, "laranja", 30, new BigDecimal(1.50));

        itemRepository.create(item1);
        itemRepository.create(item2);
        itemRepository.create(item3);
        itemRepository.create(item4);
        System.out.println("printando itens");
        itemRepository.read();

        System.out.println("printando faturas");
        Fatura fatura1 = new Fatura(new Cliente(4L, "Mari", "Rod"), itemRepository.getListaItens());
        faturaRepository.criarFatura(fatura1,clienteRepository);
        faturaRepository.read();

//        try {
//            long idCliente = scan.nextLong();
//
//            Optional<Cliente> infoCliente = clientes.stream().filter(cliente -> cliente.getId() == idCliente).findAny();
//
//            System.out.println(infoCliente.get().toString());
//        } catch (InputMismatchException e) {
//            System.out.println("Digite um ID de cliente válido.");
//        } catch (NoSuchElementException e) {
//            System.out.println("ID não encontrado.");
//        }


    }
}
