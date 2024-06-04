import java.util.Scanner;
public class Somatorio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0 , valor;
		do{
			System.out.println("\n----Menu----");
			System.out.println("Digite qualquer valor para somar");
			System.out.print("Digite Zero para sair: ");
			valor = ler.nextInt();
			soma += valor;
			System.out.println("A soma está em: " + soma);
		}while( valor != 0);
		ler.close();
	}
}

