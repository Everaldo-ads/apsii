import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Livro livro = new Livro();
		CD cd = new CD();
		
		System.out.print("Digite os dados do livro\n Nome: ");
		livro.nome=teclado.nextLine();
		System.out.print("Preço: ");
		livro.preco=teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Autor: ");
		livro.autor=teclado.nextLine();
		
		System.out.print("Digite os dados do CD\nNome: ");
		cd.nome=teclado.nextLine();
		System.out.print("Preço: ");
		cd.preco=teclado.nextDouble();
		System.out.print("Número de faixas: ");
		cd.numFaixas=teclado.nextInt();
		
		System.out.println(cd.exibeInformacoes());
	}
}
