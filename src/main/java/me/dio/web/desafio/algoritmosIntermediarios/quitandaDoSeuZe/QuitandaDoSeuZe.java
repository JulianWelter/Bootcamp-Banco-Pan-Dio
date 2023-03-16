package me.dio.web.desafio.algoritmosIntermediarios.quitandaDoSeuZe;

import java.util.Scanner;

public class QuitandaDoSeuZe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        final int PESO_TOTAL_DAS_FRUTAS = morangos + macas;
        final int PESO_PARA_DESCONTO_EXTRA = 8;
        final float VALOR_PARA_DESCONTO_EXTRA = 25.0f;
        final float DESCONTO = 0.9f;

        float precoNomalMorango = 2.5f;
        float precoAcimaDe5KgMorango = 2.2f;
        float precoNomalMaca = 1.8f;
        float precoAcimaDe5KgMaca = 1.5f;

        float resultadoMaca;
        float resultadoMorango;

        if (morangos > 5) {

            resultadoMorango = morangos * precoAcimaDe5KgMorango;
        } else {
            resultadoMorango = morangos * precoNomalMorango;
        }

        if (macas > 5) {
            resultadoMaca = macas * precoAcimaDe5KgMaca;
        } else {
            resultadoMaca = macas * precoNomalMaca;
        }

        float resultado = resultadoMaca + resultadoMorango;

        if (PESO_TOTAL_DAS_FRUTAS > PESO_PARA_DESCONTO_EXTRA || resultado > VALOR_PARA_DESCONTO_EXTRA) {
            resultado *= DESCONTO;
        }

        System.out.println(resultado);

    }


}
