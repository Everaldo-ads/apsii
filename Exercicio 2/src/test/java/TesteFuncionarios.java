import unipe.edu.br.Estagiario;
import unipe.edu.br.Funcionario;
import unipe.edu.br.FuncionarioCLT;
import unipe.edu.br.Gerente;

public class TesteFuncionarios {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(
                "Ana Costa",
                "F001",
                2500,
                "01/03/2020"
        );
        FuncionarioCLT f2 = new FuncionarioCLT(
                "Bruno Reis",
                "C001",
                3000,
                "10/06/2021",
                220,
                400
        );

        Gerente g = new Gerente(
                "Carla Mendes",
                "G001",
                8000,
                "15/01/2018",
                300,
                500,
                12,
                20
        );

        Estagiario e = new Estagiario(
                "Diego Alves",
                "E001",
                0,
                "05/08/2024",
                1500,
                2
        );
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(g.toString());
        System.out.println(e.toString());
    }

}
