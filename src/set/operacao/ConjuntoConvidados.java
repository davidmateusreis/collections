package set.operacao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> setDeConvidados;

    public ConjuntoConvidados() {
        this.setDeConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoDoConvite) {
        setDeConvidados.add(new Convidado(nome, codigoDoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoDoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : setDeConvidados) {
            if (convidado.getCodigoDoConvite() == codigoDoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        setDeConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return setDeConvidados.size();
    }

    public void exibirConvidados() {
        System.out.println(setDeConvidados);
    }
}
