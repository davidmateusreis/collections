import java.util.List;

import list.operacao.CarrinhoDeCompras;
import list.operacao.ListaTarefa;
import list.ordenacao.OrdenacaoNumeros;
import list.ordenacao.OrdenacaoPessoas;
import list.pesquisa.CatalogoLivros;
import list.pesquisa.SomaNumeros;

public class Collections {
        public static void main(String[] args) throws Exception {

                ListaTarefa listaTarefa = new ListaTarefa();

                System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalDeTarefas());

                listaTarefa.adcionarTarefa("Tarefa 1");
                listaTarefa.adcionarTarefa("Tarefa 2");

                System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalDeTarefas());

                listaTarefa.removerTarefa("Tarefa 2");

                System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalDeTarefas());

                listaTarefa.obterDescricoesDasTarefas();

                CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

                System.out
                                .println("O valor total dos itens no carrinho de compras é "
                                                + carrinhoDeCompras.calcularValorTotal());

                carrinhoDeCompras.adicionarItem("Item 1", 200.0, 1);
                carrinhoDeCompras.adicionarItem("Item 2", 200.0, 1);
                carrinhoDeCompras.adicionarItem("Item 3", 200.0, 1);

                System.out
                                .println("O valor total dos itens no carrinho de compras é "
                                                + carrinhoDeCompras.calcularValorTotal());

                carrinhoDeCompras.removerItem("Item 3");

                System.out
                                .println("O valor total dos itens no carrinho de compras é "
                                                + carrinhoDeCompras.calcularValorTotal());

                carrinhoDeCompras.exibirItens();

                CatalogoLivros catalogoLivros = new CatalogoLivros();

                catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2016);
                catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2018);
                catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2020);
                catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
                catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);

                System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
                System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2016, 2022));
                System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

                SomaNumeros soma = new SomaNumeros();

                soma.adicionarNumero(2);
                soma.adicionarNumero(4);

                int somaTotal = soma.calcularSoma();
                int maiorNumero = soma.encontrarMaiorNumero();
                int menorNumero = soma.encontrarMenorNumero();
                List<Integer> todosNumeros = soma.exibirNumeros();

                System.out.println("Soma: " + somaTotal);
                System.out.println("Maior número: " + maiorNumero);
                System.out.println("Menor número: " + menorNumero);
                System.out.println("Todos os números: " + todosNumeros);

                OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

                ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.70);
                ordenacaoPessoas.adicionarPessoa("Nome 2", 28, 1.64);
                ordenacaoPessoas.adicionarPessoa("Nome 3", 24, 1.68);
                ordenacaoPessoas.adicionarPessoa("Nome 4", 22, 1.84);

                System.out.println(ordenacaoPessoas.getListaPessoas());

                System.out.println(ordenacaoPessoas.ordenarPorIdade());
                System.out.println(ordenacaoPessoas.ordenarPorAltura());

                OrdenacaoNumeros ordenador = new OrdenacaoNumeros();
                ordenador.adicionarNumero(4);
                ordenador.adicionarNumero(2);
                ordenador.adicionarNumero(8);
                ordenador.adicionarNumero(10);

                ordenador.ordenarAscendente();
                ordenador.ordenarDescendente();
        }
}
