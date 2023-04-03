package me.dio.web.exerciciosTrabalhandoComCollectionsJava.set;

/*
Crie um conjunto contendo as cores do arco-íris e:
    •Exiba todas as cores uma abaixo da outra
    •A quantidade de cores que o arco-íris tem
    •Exiba as cores em ordem alfabética
    •Exiba as cores na ordem inversa da que foi informada
    •Exiba todas as cores que começam com a letra ”v”
    •Remova todas as cores que não começam com a letra “v”
    •Limpe o conjunto
    •Confira se o conjunto está vazio
* */

import java.util.*;

public class ArcoIris {
    public static void arcoIris() {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println("Quantidade de Cores: " + coresArcoIris.size());

        Set<String> coresArcoIrisTreeSet = new TreeSet<>();
        coresArcoIrisTreeSet.add("violeta");
        coresArcoIrisTreeSet.add("anil");
        coresArcoIrisTreeSet.add("azul");
        coresArcoIrisTreeSet.add("verde");
        coresArcoIrisTreeSet.add("amarelo");
        coresArcoIrisTreeSet.add("laranja");
        coresArcoIrisTreeSet.add("vermelho");
        System.out.println(coresArcoIrisTreeSet);

        Set<String> coresArcoIrisLinkedHashSet = new LinkedHashSet<>();
        coresArcoIrisLinkedHashSet.add("violeta");
        coresArcoIrisLinkedHashSet.add("anil");
        coresArcoIrisLinkedHashSet.add("azul");
        coresArcoIrisLinkedHashSet.add("verde");
        coresArcoIrisLinkedHashSet.add("amarelo");
        coresArcoIrisLinkedHashSet.add("laranja");
        coresArcoIrisLinkedHashSet.add("vermelho");
        System.out.println(coresArcoIrisLinkedHashSet);
        for (int i = coresArcoIrisLinkedHashSet.size() - 1; i >= 0; i--) {
            System.out.println(coresArcoIrisLinkedHashSet.toArray()[i]);
        }
        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String next : coresArcoIris) {
            if (next.charAt(0) == 'v') System.out.println(next);
        }
        System.out.println("Remova todas as cores que começam com a letra ”v”: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().charAt(0) == 'v') iterator.remove();
        }
        System.out.println(coresArcoIris);
        System.out.println("Limpe o conjunto");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);
        System.out.println(coresArcoIris.isEmpty());

    }

}
