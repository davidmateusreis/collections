package map.operacao;

import java.util.HashMap;
import java.util.Map;

public class AgendaCompromissos {

    private Map<String, Integer> mapDeAgendaDeCompromissos;

    public AgendaCompromissos() {
        this.mapDeAgendaDeCompromissos = new HashMap<>();
    }

    public void adicionarCompromisso(String nome, Integer prioridade) {
        mapDeAgendaDeCompromissos.put(nome, prioridade);
    }

    public void removerCompromisso(String nome) {
        if (!mapDeAgendaDeCompromissos.isEmpty()) {
            mapDeAgendaDeCompromissos.remove(nome);
        }
    }

    public void exibirCompromissos() {
        System.out.println(mapDeAgendaDeCompromissos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer compromissoPorNome = null;
        if (!mapDeAgendaDeCompromissos.isEmpty()) {
            compromissoPorNome = mapDeAgendaDeCompromissos.get(nome);
        }
        return compromissoPorNome;
    }
}
