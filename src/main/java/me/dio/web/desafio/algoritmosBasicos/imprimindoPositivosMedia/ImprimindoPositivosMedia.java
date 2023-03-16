package me.dio.web.desafio.algoritmosBasicos.imprimindoPositivosMedia;

import java.util.Locale;
import java.util.Scanner;

public class ImprimindoPositivosMedia {

    public static void ImprimindoPositivosMedia() {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:

        System.out.println("digite um valor ");
        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x >= 0) {
                cont++;
                media += x;
            }
        }

        media /= cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f%n", media);
    }

}
