import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Livro livro = new Livro();
		CD cd = new CD();
		
		System.out.print("Digite os dados do livro\n Nome: ");
		livro.setNome(teclado.nextLine());
		System.out.print("Preço: ");
		livro.setPreco(teclado.nextDouble());
		teclado.nextLine();
		System.out.print("Autor: ");
		livro.setAutor(teclado.nextLine());
		
		System.out.print("Digite os dados do CD\nNome: ");
		cd.setNome(teclado.nextLine());
		System.out.print("Preço: ");
		cd.setPreco(teclado.nextDouble());
		System.out.print("Número de faixas: ");
		cd.setNumFaixas(teclado.nextInt());
		
		System.out.println(cd.exibeInformacoes());
	}
}
