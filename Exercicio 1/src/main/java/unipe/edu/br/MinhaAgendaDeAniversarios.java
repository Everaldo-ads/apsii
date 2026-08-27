package unipe.edu.br;

import unipe.edu.br.interfaces.AgendaDeAniversarios;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<Aniversariante>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        DataAniversario dataAniversario = new DataAniversario(dia, mes);
        this.aniversariantes.add(new Aniversariante(nome, dataAniversario));
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        DataAniversario dataAniversario = new DataAniversario(dia, mes);
        return this.aniversariantes.stream()
                .filter(
                aniversariante -> aniversariante.getDataAniversario().equals(dataAniversario)
                ).map(Aniversariante::getNome)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        this.aniversariantes.removeIf(
                aniversariante -> aniversariante.getNome().equals(nomeAniversariante)
        );
    }
}
