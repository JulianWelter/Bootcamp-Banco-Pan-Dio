package me.dio.web.desafio.algoritmosIntermediarios.contaEspacosVogais;

import java.util.Scanner;

public class ContaEspacoVogais {
    public static void ContaEspacoVogais() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
            item = item.toLowerCase();
            for (int i = 0; i < item.length(); i++) {
                char c = item.charAt(i);
                for (char vogal : arrVogais) {
                    if (c == vogal) {
                        quantVogais++;
                    }
                    if (c == ' ') {
                        espacosEmBranco++;
                    }
                }
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
