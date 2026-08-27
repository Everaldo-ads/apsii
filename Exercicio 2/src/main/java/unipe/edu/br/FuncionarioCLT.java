package unipe.edu.br;

public class FuncionarioCLT extends Funcionario{

    private double valeTransporte;
    private double valeAlimentacao;

    public FuncionarioCLT(
            String nome,
            String matricula,
            double salarioBase,
            String dataAdmissao,
            double valeTransporte,
            double valeAlimentacao
    ) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()+this.valeAlimentacao+this.valeTransporte;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto()+50;
    }

}
