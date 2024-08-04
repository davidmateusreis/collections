package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> mapDeEventos;

    public AgendaEventos() {
        this.mapDeEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        mapDeEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> treeMapDeEventos = new TreeMap<>(mapDeEventos);
        System.out.println(treeMapDeEventos);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximaEvento = null;
        Map<LocalDate, Evento> treeMapDeEventos = new TreeMap<>(mapDeEventos);
        for (Map.Entry<LocalDate, Evento> entry : treeMapDeEventos.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximaEvento = entry.getValue();
                System.out.println("O próximo evento " + proximaEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }
}
