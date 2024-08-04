package map.operacao;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> mapDePalavras;

    public Dicionario() {
        this.mapDePalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        mapDePalavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!mapDePalavras.isEmpty()) {
            mapDePalavras.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(mapDePalavras);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!mapDePalavras.isEmpty()) {
            palavraPesquisada = mapDePalavras.get(palavra);
        }
        return palavraPesquisada;
    }
}
