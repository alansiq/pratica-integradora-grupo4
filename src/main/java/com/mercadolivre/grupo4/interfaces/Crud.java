package com.mercadolivre.grupo4.interfaces;

public interface Crud <T>{
    void create(T o);
    T read(T o);
    T update(T o);
    void delete(T o);
}
