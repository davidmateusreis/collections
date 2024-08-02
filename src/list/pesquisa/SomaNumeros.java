package list.pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        return Collections.max(numeros);
    }

    public int encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        return Collections.min(numeros);
    }

    public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros);
    }
}
