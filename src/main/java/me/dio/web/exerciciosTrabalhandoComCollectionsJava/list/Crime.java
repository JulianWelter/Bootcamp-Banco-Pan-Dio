package me.dio.web.exerciciosTrabalhandoComCollectionsJava.list;

/*
Utilizando listas,faça um programa que faça 5perguntas para uma
        pessoa sobre um crime.As perguntas são:
        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2questões ela deve ser
        classificada como"Suspeita",entre 3e 4como"Cúmplice"e 5como
        "Assassina".Caso contrário, ela será classificado como"Inocente".
 */

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Crime {
    public static void crime() {
        List<String> perguntas = List.of("Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.next();
            if (Objects.equals(resposta, "s")) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Suspeita");
        } else if (count >= 3 && count <= 4) {
            System.out.println("Cúmplice");
        } else if (count == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
    }
}
