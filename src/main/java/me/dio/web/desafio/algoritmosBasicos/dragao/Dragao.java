package me.dio.web.desafio.algoritmosBasicos.dragao;

import java.util.Scanner;

public class Dragao {

    public static void Dragao() {
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for (int i = 0; i < casos; i++) {
            poderDeLuta = ler.nextInt();

//TODO: Implemente a condição adequada para a impressão dos textos conforme o solicitado no desafio:

            if (poderDeLuta <= 8000) {
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }

}
