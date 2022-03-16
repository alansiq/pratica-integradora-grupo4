package com.mercadolivre.grupo4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor

public class Cliente {
    private Long id;
    private String nome;
    private String sobrenome;

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", nome:'" + nome + '\'' +
                ", sobrenome:'" + sobrenome + '\'' +
                '}';
    }
}



