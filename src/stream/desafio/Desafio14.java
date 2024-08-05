package stream.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(numero -> isPrimo(numero))
                .max((a, b) -> Integer.compare(a, b));

        System.out.println("O maior número primo é o " + maiorNumeroPrimo.orElse(null));
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
