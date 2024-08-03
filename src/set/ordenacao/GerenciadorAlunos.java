package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    public Set<Aluno> setDeAlunos;

    public GerenciadorAlunos() {
        this.setDeAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        setDeAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!setDeAlunos.isEmpty()) {
            for (Aluno aluno : setDeAlunos) {
                if (aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                    break;
                }
            }
            setDeAlunos.remove(alunoParaRemover);
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(setDeAlunos);
        if (!setDeAlunos.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O set está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!setDeAlunos.isEmpty()) {
            alunosPorNota.addAll(setDeAlunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O set está vazio!");
        }
    }

    public void exibirAlunos() {
        for (Aluno aluno : setDeAlunos) {
            System.out.println(aluno);
        }
    }
}
