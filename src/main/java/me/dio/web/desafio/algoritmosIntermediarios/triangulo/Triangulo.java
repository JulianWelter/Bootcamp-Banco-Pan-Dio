package me.dio.web.desafio.algoritmosIntermediarios.triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

    public static void Triangulo() {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        boolean triangulo = A + B > C && B + C > A && A + C > B;

        if (triangulo) {
            System.out.println("Perimetro = " + (A + B + C));
        } else {
            System.out.println("Area  = " + ((A + B) * C) / 2);
        }

    }


}