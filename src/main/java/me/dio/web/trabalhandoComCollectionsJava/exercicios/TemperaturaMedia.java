package me.dio.web.trabalhandoComCollectionsJava.exercicios;

/*
Faça um programa que receba a temperatura média dos 6
        primeiros meses do ano e armazene-as em uma lista.

        Após isto, calcule a média semestral das temperaturas e
        mostre todas as temperaturas acima desta média, e em que
        mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
        – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {
    public static void TemperaturaMedia() {
        final List<String> mesesDoAno = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");
        Scanner scanner = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        double media = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite o valor para o mes " + i);
            double valor = scanner.nextDouble();
            lista.add(valor);
            media += valor;
        }
        List<String> resultado = new ArrayList<>();
        media /= 6;
        for (int i = 0; i < 6; i++) {
            double nota = lista.get(i);
            if (nota > media) {
                resultado.add(i + 1 + " - " + mesesDoAno.get(i));
            }
        }

        for (int i = 0; i < resultado.size(); i++) {
            System.out.print(resultado.get(i));
            if (i != resultado.size() - 1) {
                System.out.print(", ");
            }
        }


    }
}
