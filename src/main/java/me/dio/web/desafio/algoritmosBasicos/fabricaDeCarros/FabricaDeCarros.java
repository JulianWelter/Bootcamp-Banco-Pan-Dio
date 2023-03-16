package me.dio.web.desafio.algoritmosBasicos.fabricaDeCarros;

import java.util.Scanner;

public class FabricaDeCarros {

    public static void FabricaDeCarros() {
        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;

        int distribuidor;
        int valorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

       distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;


        System.out.println(distribuidor);
    }
}
