package stream.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> primos = numeros.stream()
                .filter(numero -> isPrimo(numero))
                .toList();

        System.out.println("Os números primos são " + primos);
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1)
            return false;
        if (numero == 2)
            return true;
        if (numero % 2 == 0)
            return false;
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
