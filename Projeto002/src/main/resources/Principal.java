public class Principal {
    public static void main(String[] args) {
        Banco b1 = new Banco("Raul", "000", 15);
        Banco b2 = new Banco();

        //Exercicio
        Banco b3 = new Banco();
        System.out.println("Nome da conta 3: "+b3.getNome());
        b3.setNome("João");
        System.out.println("Novo nome da conta banco 3:"+b3.getNome());
    }
}
