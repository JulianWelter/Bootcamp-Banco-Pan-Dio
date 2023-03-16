package me.dio.web.desafio.algoritmosIntermediarios.quitandaDoSeuZe;

import java.util.Scanner;

public class QuitandaDoSeuZe {

    public static void QuitandaDoSeuZe() {
        Scanner input = new Scanner(System.in);
        final int morangos = input.nextInt();
        final int macas = input.nextInt();
        float resultadoMaca;
        float resultadoMorango;

        final int PESO_TOTAL_DAS_FRUTAS = morangos + macas;
        final int PESO_PARA_DESCONTO_EXTRA = 8;

        final float VALOR_PARA_DESCONTO_EXTRA = 25.0f;
        final float DESCONTO = 0.9f;
        final float PRECO_NORMAL_MORANGO  = 2.5f;
        final float PRECO_ACIMA_DE_5KG_MORANGO  = 2.2f;
        final float PRECO_NORMAL_MACA  = 1.8f;
        final float PRECO_ACIMA_DE_5KG_MACA  = 1.5f;

        if (morangos > 5) {
            resultadoMorango = morangos * PRECO_ACIMA_DE_5KG_MORANGO ;
        } else {
            resultadoMorango = morangos * PRECO_NORMAL_MORANGO ;
        }

        if (macas > 5) {
            resultadoMaca = macas * PRECO_ACIMA_DE_5KG_MACA ;
        } else {
            resultadoMaca = macas * PRECO_NORMAL_MACA ;
        }

        float resultado = resultadoMaca + resultadoMorango;

        if (PESO_TOTAL_DAS_FRUTAS > PESO_PARA_DESCONTO_EXTRA || resultado > VALOR_PARA_DESCONTO_EXTRA) {
            resultado *= DESCONTO;
        }

        System.out.println(resultado);

    }


}
