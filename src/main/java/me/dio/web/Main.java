package me.dio.web;

import me.dio.web.noGenereico.No;
import me.dio.web.fila.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        System.out.println(fila.isEmpty());
        fila.enqueue(new No<>(56));
        fila.enqueue(5);
        System.out.println(fila.first());
        System.out.println(fila.dequeue());
        System.out.println(fila.first());
        System.out.println(fila.dequeue());
        System.out.println(fila.first());


    }
}
