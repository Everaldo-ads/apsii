

public class Banco {
    private String nome;
    private String cpf;
    private double saldo;

    public Banco(String novoNome, String novoCPF, double novoSaldo) {
        this.nome = novoNome;
        this.cpf = novoCPF;
        this.saldo = novoSaldo;
    }
    public Banco() {
        this.nome = "Sem nome";
        this.cpf = "Sem CPF";
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
