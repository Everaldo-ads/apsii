package unipe.edu.br;

public class Gerente extends FuncionarioCLT{

    private int tamanhoEquipe;
    private double percentualBonus;
    public Gerente(
            String nome,
            String matricula,
            double salarioBase,
            String dataAdmissao,
            double valeTransporte,
            double valeAlimentacao,
            int tamanhoEquipe,
            double percentualBonus
    ) {
        super(
                nome,
                matricula,
                salarioBase,
                dataAdmissao,
                valeTransporte,
                valeAlimentacao
        );
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public void setTamanhoEquipe(int tamanhoEquipe) {
        this.tamanhoEquipe = tamanhoEquipe;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()+this.getSalarioBase()*(this.percentualBonus/100);
    }

    @Override
    public double calcularDesconto() {
        if (this.tamanhoEquipe>10) {
            return super.calcularDesconto()+100;
        }
        return super.calcularDesconto();
    }
}
