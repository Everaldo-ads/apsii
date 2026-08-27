package unipe.edu.br;

public class Estagiario extends Funcionario{

    private double valorBolsaAuxilio;
    private int cargaHoraria;

    public Estagiario(
            String nome,
            String matricula,
            double salarioBase,
            String dataAdmissao,
            double valorBolsaAuxilio,
            int cargaHoraria
    ) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularSalario() {
        return this.valorBolsaAuxilio;
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }
}
