package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> setDeTarefas;

    public ListaTarefas() {
        this.setDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        setDeTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!setDeTarefas.isEmpty()) {
            for (Tarefa tarefa : setDeTarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = tarefa;
                    break;
                }
            }
            setDeTarefas.remove(tarefaParaRemover);
        }
    }

    public void exibirTarefas() {
        if (!setDeTarefas.isEmpty()) {
            System.out.println(setDeTarefas);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefas() {
        return setDeTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : setDeTarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : setDeTarefas) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : setDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa tarefa : setDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = tarefa;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
            }
        } else {
            System.out.println("A tarefa não foi encontrada na lista!");
        }
    }

    public void limparListaTarefas() {
        if (setDeTarefas.isEmpty()) {
            System.out.println("A lista de tarefas já está vazia!");
        } else {
            setDeTarefas.clear();
        }
    }
}
