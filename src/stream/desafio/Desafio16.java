package stream.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Map<String, List<Integer>> agrupados = numeros.stream()
                .collect(Collectors.groupingBy(numero -> numero % 2 == 0 ? "Pares" : "Ímpares"));

        System.out.println("Os números pares são " + agrupados.get("Pares"));
        System.out.println("Os números ímpares são " + agrupados.get("Ímpares"));
    }
}
