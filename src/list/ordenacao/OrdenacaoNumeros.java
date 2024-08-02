package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    public List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numeros);
        System.out.println("Lista ordenada em ordem ascendente: " + numeros);
    }

    public void ordenarDescendente() {
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista ordenada em ordem descendente: " + numeros);
    }
}
