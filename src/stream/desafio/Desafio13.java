package stream.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int inicioDoIntervalo = 5;
        int fimDoIntervalo = 10;

        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(numero -> numero >= inicioDoIntervalo && numero <= fimDoIntervalo)
                .toList();

        System.out.println("Os números no intervalo entre " + inicioDoIntervalo + " e " + fimDoIntervalo + " são "
                + numerosNoIntervalo);
    }
}
