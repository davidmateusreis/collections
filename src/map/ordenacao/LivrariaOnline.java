package map.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    private Map<String, Livro> mapDeLivros;

    public LivrariaOnline() {
        this.mapDeLivros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        mapDeLivros.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> chavesParaRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : mapDeLivros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesParaRemover.add(entry.getKey());
            }
        }
        for (String chaveParaRemover : chavesParaRemover) {
            mapDeLivros.remove(chaveParaRemover);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(mapDeLivros.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(mapDeLivros.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public List<Livro> exibirLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisCaro = Double.MIN_VALUE;

        if (!mapDeLivros.isEmpty()) {
            for (Livro livro : mapDeLivros.values()) {
                if (livro.getPreco() > precoMaisCaro) {
                    precoMaisCaro = livro.getPreco();
                }
            }
        }
        for (Map.Entry<String, Livro> entry : mapDeLivros.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisCaro) {
                Livro livroMaisCaro = mapDeLivros.get(entry.getKey());
                livrosMaisCaros.add(livroMaisCaro);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> exibirLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBarato = Double.MAX_VALUE;

        if (!mapDeLivros.isEmpty()) {
            for (Livro livro : mapDeLivros.values()) {
                if (livro.getPreco() < precoMaisBarato) {
                    precoMaisBarato = livro.getPreco();
                }
            }
        }
        for (Map.Entry<String, Livro> entry : mapDeLivros.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBarato) {
                Livro livroMaisBarato = mapDeLivros.get(entry.getKey());
                livrosMaisBaratos.add(livroMaisBarato);
            }
        }
        return livrosMaisBaratos;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPesquisadosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : mapDeLivros.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPesquisadosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPesquisadosPorAutor;
    }
}
