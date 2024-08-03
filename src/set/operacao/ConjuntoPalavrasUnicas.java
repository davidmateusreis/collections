package set.operacao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> setDePalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        setDePalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        setDePalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!setDePalavrasUnicas.isEmpty()) {
            if (setDePalavrasUnicas.contains(palavra)) {
                setDePalavrasUnicas.remove(palavra);
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        return setDePalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!setDePalavrasUnicas.isEmpty()) {
            System.out.println(setDePalavrasUnicas);
        }
    }
}
