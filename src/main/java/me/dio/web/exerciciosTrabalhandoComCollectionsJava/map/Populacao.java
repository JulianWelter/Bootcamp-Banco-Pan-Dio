package me.dio.web.exerciciosTrabalhandoComCollectionsJava.map;

import java.util.*;

public class Populacao {

    public static void populacao() {
        HashMap<String, Integer> hashMap = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Inicio: " + hashMap);
        hashMap.put("RN", 3534165);
        System.out.println("Com Rn atualizado: " + hashMap);
        if (!hashMap.containsKey("PB")) {
            hashMap.put("PB", 4039277);
            System.out.println("Com PB: " + hashMap);
            System.out.println("Populacao de PE: " + hashMap.get("PE"));
        }

        HashMap<String, Integer> linkedHashMap = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        Set<Map.Entry<String, Integer>> treeMap = new TreeSet<>(new ComparablePopulacao());
        treeMap.addAll(hashMap.entrySet());

        System.out.println("Estados e suas populações na ordem que foi\n" +
                "informado: " + linkedHashMap);
        System.out.println("estados e suas populações em ordem alfabética: " + treeMap);

        Map.Entry<String, Integer> menorPopulacao = Collections.min(treeMap, new ComparablePopulacao());
        Map.Entry<String, Integer> maiorPopulacao = Collections.max(treeMap, new ComparablePopulacao());

        System.out.println("estado com a menor população: " + menorPopulacao.getKey() + " " + menorPopulacao.getValue());
        System.out.println("estado com a maior população: " + maiorPopulacao.getKey() + " " + maiorPopulacao.getValue());
        int somaPopulacao = 0;
        for (Map.Entry<String, Integer> cidade : treeMap) {
            somaPopulacao += cidade.getValue();
        }

        System.out.println("A soma da população desses estados é:" + somaPopulacao);
        System.out.println("A média da população desses estados é:" + somaPopulacao / treeMap.size());

        Iterator<Map.Entry<String, Integer>> iterator = treeMap.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 4000000) iterator.remove();
        }
        System.out.println("Sem estados com a população menor que 4.000.000 " + treeMap);
        treeMap.clear();
        System.out.println("Dicionario apagado " + treeMap);
        System.out.println("Dicionario esta sem nada? " + treeMap.isEmpty());

    }


}

class ComparablePopulacao implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
