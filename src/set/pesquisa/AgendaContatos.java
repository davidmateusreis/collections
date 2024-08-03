package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> setDeContatos;

    public AgendaContatos() {
        this.setDeContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        setDeContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(setDeContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : setDeContatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : setDeContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumeroDeTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
