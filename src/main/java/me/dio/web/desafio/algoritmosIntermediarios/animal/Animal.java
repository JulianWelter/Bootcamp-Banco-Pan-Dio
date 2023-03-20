package me.dio.web.desafio.algoritmosIntermediarios.animal;

import java.util.Scanner;

public class Animal {
    public static void Animal() {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3, resultado;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (AN1.equals("vertebrado")) {
            if (AN2.equals("ave")) {
                if (AN3.equals("carnivoro")) {
                    resultado = "aguia";
                } else {
                    resultado = "pomba";
                }
            } else {
                if (AN3.equals("onivoro")) {
                    resultado = "homem";
                } else {
                    resultado = "vaca";
                }
            }
        } else {
            if (AN2.equals("inseto")) {
                if (AN3.equals("hematofago")) {
                    resultado = "pulga";
                } else {
                    resultado = "lagarta";
                }
            } else {
                if (AN3.equals("hematofago")) {
                    resultado = "sanguessuga";
                } else {
                    resultado = "minhoca";
                }
            }
        }
        System.out.println(resultado);
    }
}
