package stream.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> imparesMultiplos = numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
                .toList();

        System.out.println("Valores ímpares múltiplos de 3 e 5 são " + imparesMultiplos);
    }
}
