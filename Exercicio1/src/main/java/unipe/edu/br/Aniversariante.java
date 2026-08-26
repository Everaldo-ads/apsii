package unipe.edu.br;

public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, DataAniversario dataAniversario){
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public Aniversariante(String nome, int dia, int mes){
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public boolean equals(String nome, DataAniversario dataAniversario) {
        return this.nome.equals(nome) && this.dataAniversario.equals(dataAniversario);
    }
}
