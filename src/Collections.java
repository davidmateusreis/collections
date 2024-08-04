import java.time.LocalDate;
import java.util.List;

import list.operacao.CarrinhoDeCompras;
import list.operacao.ListaTarefa;
import list.ordenacao.OrdenacaoNumeros;
import list.ordenacao.OrdenacaoPessoas;
import list.pesquisa.CatalogoLivros;
import list.pesquisa.SomaNumeros;
import map.operacao.AgendaCompromissos;
import map.operacao.Dicionario;
import map.ordenacao.AgendaEventos;
import map.ordenacao.LivrariaOnline;
import map.ordenacao.Livro;
import map.pesquisa.ContagemPalavras;
import map.pesquisa.EstoqueProdutos;
import set.operacao.ConjuntoConvidados;
import set.operacao.ConjuntoPalavrasUnicas;
import set.ordenacao.CadastroProdutos;
import set.ordenacao.GerenciadorAlunos;
import set.pesquisa.AgendaContatos;
import set.pesquisa.ListaTarefas;

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

                ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

                System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                                + " convidado(s) dentro do set de convidados");

                conjuntoConvidados.adicionarConvidado("Convidado 1", 0001);
                conjuntoConvidados.adicionarConvidado("Convidado 2", 0002);
                conjuntoConvidados.adicionarConvidado("Convidado 3", 0002);
                conjuntoConvidados.adicionarConvidado("Convidado 4", 0003);

                conjuntoConvidados.exibirConvidados();

                System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                                + " convidado(s) dentro do set de convidados");

                conjuntoConvidados.removerConvidadoPorCodigoDoConvite(0002);

                System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                                + " convidado(s) dentro do set de convidados");

                conjuntoConvidados.exibirConvidados();

                ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

                conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
                conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
                conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");

                conjuntoPalavrasUnicas.exibirPalavrasUnicas();

                conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
                conjuntoPalavrasUnicas.exibirPalavrasUnicas();

                System.out.println("A 'Palavra 1' faz parte do conjunto? "
                                + conjuntoPalavrasUnicas.verificarPalavra("Palavra 1"));
                System.out.println("A 'Palavra 2' faz parte do conjunto? "
                                + conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

                AgendaContatos agendaContatos = new AgendaContatos();

                agendaContatos.adicionarContato("Armin", 111111111);
                agendaContatos.adicionarContato("Armin", 222222222);
                agendaContatos.adicionarContato("Armin Arlert", 333333333);
                agendaContatos.adicionarContato("Armin Ackerman", 444444444);
                agendaContatos.adicionarContato("Mikasa Ackerman", 555555555);

                agendaContatos.exibirContatos();

                System.out.println(agendaContatos.pesquisarPorNome("Armin"));

                System.out.println("Contato atualizado: "
                                + agendaContatos.atualizarNumeroContato("Mikasa Ackerman", 888888888));

                agendaContatos.exibirContatos();

                ListaTarefas listaTarefas = new ListaTarefas();

                listaTarefas.adicionarTarefa("Tarefa 1");
                listaTarefas.adicionarTarefa("Tarefa 2");
                listaTarefas.adicionarTarefa("Tarefa 3");
                listaTarefas.adicionarTarefa("Tarefa 4");

                listaTarefas.exibirTarefas();

                listaTarefas.removerTarefa("Tarefa 4");
                listaTarefas.exibirTarefas();

                System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

                System.out.println(listaTarefas.obterTarefasPendentes());

                listaTarefas.marcarTarefaConcluida("Tarefa 1");
                listaTarefas.marcarTarefaConcluida("Tarefa 2");

                System.out.println(listaTarefas.obterTarefasConcluidas());

                listaTarefas.marcarTarefaPendente("Tarefa 1");
                listaTarefas.exibirTarefas();

                listaTarefas.limparListaTarefas();
                listaTarefas.exibirTarefas();

                CadastroProdutos cadastroProdutos = new CadastroProdutos();

                cadastroProdutos.adicionarProduto(1L, "Produto 2", 1000, 10);
                cadastroProdutos.adicionarProduto(2L, "Produto 4", 2000, 2);
                cadastroProdutos.adicionarProduto(2L, "Produto 3", 4000, 12);
                cadastroProdutos.adicionarProduto(3L, "Produto 1", 8000, 8);

                System.out.println(cadastroProdutos.setDeProdutos);

                System.out.println(cadastroProdutos.exibirProdutosPorNome());

                System.out.println(cadastroProdutos.exibirProdutosPorPreco());

                GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

                gerenciadorAlunos.adicionarAluno("Aluno 1", 1L, 6.0);
                gerenciadorAlunos.adicionarAluno("Aluno 2", 2L, 2.0);
                gerenciadorAlunos.adicionarAluno("Aluno 3", 3L, 8.0);
                gerenciadorAlunos.adicionarAluno("Aluno 4", 4L, 4.0);

                gerenciadorAlunos.exibirAlunos();

                gerenciadorAlunos.removerAluno(4L);

                gerenciadorAlunos.exibirAlunos();

                gerenciadorAlunos.exibirAlunosPorNome();
                gerenciadorAlunos.exibirAlunosPorNota();

                AgendaCompromissos agendaCompromissos = new AgendaCompromissos();

                agendaCompromissos.adicionarCompromisso("Compromisso 1", 4);
                agendaCompromissos.adicionarCompromisso("Compromisso 1", 1);
                agendaCompromissos.adicionarCompromisso("Compromisso 3", 3);
                agendaCompromissos.adicionarCompromisso("Compromisso 4", 6);
                agendaCompromissos.adicionarCompromisso("Compromisso 5", 3);
                agendaCompromissos.adicionarCompromisso("Compromisso 1", 5);

                agendaCompromissos.exibirCompromissos();

                agendaCompromissos.removerCompromisso("Compromisso 5");
                agendaCompromissos.exibirCompromissos();

                System.out.println("O número é " + agendaCompromissos.pesquisarPorNome("Compromisso 4"));

                Dicionario dicionario = new Dicionario();

                dicionario.adicionarPalavra("Palavra 1", "Definição 1");
                dicionario.adicionarPalavra("Palavra 2", "Definição 2");
                dicionario.adicionarPalavra("Palavra 3", "Definição 3");
                dicionario.adicionarPalavra("Palavra 4", "Definição 4");

                dicionario.removerPalavra("Palavra 4");
                dicionario.exibirPalavras();

                String definicaoDaPalavra = dicionario.pesquisarPorPalavra("Palavra 3");
                System.out.println(definicaoDaPalavra);

                EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

                estoqueProdutos.exibirProdutos();

                estoqueProdutos.adicionarProduto(1L, "Produto 1", 2, 2.0);
                estoqueProdutos.adicionarProduto(2L, "Produto 2", 4, 4.0);
                estoqueProdutos.adicionarProduto(3L, "Produto 3", 6, 6.0);

                estoqueProdutos.exibirProdutos();

                System.out.println("O valor total do estoque é de R$" + estoqueProdutos.calcularValorTotalEstoque());
                System.out.println("O produto mais caro é o " + estoqueProdutos.obterProdutoMaisCaro());
                System.out.println("O produto mais barato é o " + estoqueProdutos.obterProdutoMaisBarato());
                System.out.println("O produto que está em maior quantidade no estoque é o "
                                + estoqueProdutos.obterProdutoComMaiorQuantidadeEValorTotalNoEstoque());

                ContagemPalavras contagemPalavras = new ContagemPalavras();

                contagemPalavras.adicionarPalavra("Java", 8);
                contagemPalavras.adicionarPalavra("C#", 6);
                contagemPalavras.adicionarPalavra("Ruby", 2);
                contagemPalavras.adicionarPalavra("PHP", 4);

                System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras");

                String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
                System.out.println("A linguagem mais frequente é o " + palavraMaisFrequente);

                AgendaEventos agendaEventos = new AgendaEventos();

                agendaEventos.adicionarEvento(LocalDate.of(2022, 6, 8), "Evento 1", "Atração 1");
                agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 2), "Evento 2", "Atração 2");
                agendaEventos.adicionarEvento(LocalDate.of(2020, 2, 4), "Evento 3", "Atração 3");
                agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 3), "Evento 4", "Atração 4");
                agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 4), "Evento 5", "Atração 5");
                agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 8), "Evento 6", "Atração 6");

                agendaEventos.exibirAgenda();

                agendaEventos.obterProximoEvento();

                LivrariaOnline livrariaOnline = new LivrariaOnline();

                livrariaOnline.adicionarLivro("Link 1", new Livro("Titulo 1", "Autor 1", 100));
                livrariaOnline.adicionarLivro("Link 2", new Livro("Titulo 2", "Autor 2", 10));
                livrariaOnline.adicionarLivro("Link 3", new Livro("Titulo 3", "Autor 2", 60));
                livrariaOnline.adicionarLivro("Link 4", new Livro("Titulo 4", "Autor 4", 40));
                livrariaOnline.adicionarLivro("Link 5", new Livro("Titulo 5", "Autor 5", 80));
                livrariaOnline.adicionarLivro("Link 6", new Livro("Titulo 6", "Autor 6", 20));

                System.out.println("Livros ordenados por preço " + livrariaOnline.exibirLivrosOrdenadosPorPreco());
                System.out.println("Livros ordenados por autor " + livrariaOnline.exibirLivrosOrdenadosPorAutor());

                livrariaOnline.removerLivro("Titulo 6");

                String pesquisaPorAutor = "Autor 2";
                System.out.println(
                                "Os livros do Autor 2 são " + livrariaOnline.pesquisarLivrosPorAutor(pesquisaPorAutor));

                System.out.println("O livro mais caro é o " + livrariaOnline.exibirLivroMaisCaro());
                System.out.println("O livro mais barato é o " + livrariaOnline.exibirLivroMaisBarato());
        }
}
