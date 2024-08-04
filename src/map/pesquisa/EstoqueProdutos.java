package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> mapDeEstoqueDeProdutos;

    public EstoqueProdutos() {
        this.mapDeEstoqueDeProdutos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        mapDeEstoqueDeProdutos.put(codigo, new Produto(codigo, nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(mapDeEstoqueDeProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!mapDeEstoqueDeProdutos.isEmpty()) {
            for (Produto produto : mapDeEstoqueDeProdutos.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!mapDeEstoqueDeProdutos.isEmpty()) {
            for (Produto produto : mapDeEstoqueDeProdutos.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!mapDeEstoqueDeProdutos.isEmpty()) {
            for (Produto produto : mapDeEstoqueDeProdutos.values()) {
                if (produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoComMaiorQuantidadeEValorTotalNoEstoque() {
        Produto produtoComMaiorQuantidadeEValorTotalNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if (!mapDeEstoqueDeProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : mapDeEstoqueDeProdutos.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoComMaiorQuantidadeEValorTotalNoEstoque = entry.getValue();
                }
            }
        }
        return produtoComMaiorQuantidadeEValorTotalNoEstoque;
    }
}
