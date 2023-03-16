package me.dio.web.desafio.algoritmosBasicos.SomaHComNTermos;

import java.util.Scanner;

public class SomaH {
    public static void SomaH() {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h += (1.0 / i);
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.printf("%.0f%n", h);
    }
}
