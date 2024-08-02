package list.operacao;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItems;

    public CarrinhoDeCompras() {
        this.listaItems = new ArrayList<>();
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItems.add(new Item(nome, 1.0, quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itensParaRemover = new ArrayList<>();

        for (Item item : listaItems) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        listaItems.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        return listaItems.size();
    }

    public void exibirItens() {
        System.out.println(listaItems);
    }
}
