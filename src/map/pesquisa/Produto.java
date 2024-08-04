package map.pesquisa;

public class Produto {

    private long codigo;
    private String name;
    private int quantidade;
    private double preco;

    public Produto(long codigo, String name, int quantidade, double preco) {
        this.codigo = codigo;
        this.name = name;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", name=" + name + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}
