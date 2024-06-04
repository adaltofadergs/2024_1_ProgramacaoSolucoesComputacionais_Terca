/* *****************************************************************************
	Laço de Repetição
	1. Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e
	cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos
	serão necessários para que Zé seja maior que Chico.
	*******************************************************************************/
public class Altura {
	public static void main(String[] args) {
		double chico = 1.50 ;
		double ze = 1.10;
		int anos = 0;

		while( chico >= ze ){
			chico = chico + 0.02;
			ze += 0.03;
			anos++;
		}
		System.out.println(	"Serão necessários " + anos + 
					" anos para Zé ser maior que Chico");
		System.out.println("Altura do Chico: " + String.format("%.2f", chico) );
		System.out.printf("Altura do Zé: %.2f \n" , ze );

	}
}


/******************************************************************************
1 ) Faça um programa que leia o código dos produtos pedidos e as quantidades desejadas;
calcule e mostre o valor a ser pago por produto (preço * quantidade) e o total do pedido.
Considere que o cliente deve informar quando o pedido deve ser encerrado.

Produto             |  Código   |   Preço (unitário)
------------------------------------------------------
Cachorro quente     |    1      |     R$ 1,50
Hamburger           |    2      |     R$ 2,00
Cheeseburger        |    3      |     R$ 2,50
Eggcheeseburger     |    4      |     R$ 3,00
Refrigerante        |    5      |     R$ 1,50

************************************************
2) Foi realizada uma pesquisa de algumas características físicas da população de uma certa
região, a qual coletaram os seguintes dados referentes a cada habitante para serem
analisados:
    sexo (masculino e feminino)
    idade
Faça um algoritmo que determine e escreva:
    a maior idade dos habitantes;
    a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos, 
    inclusive;
O final do conjunto de habitantes é reconhecido pelo valor -1 informado como
idade.
*******************************************************************************/

// String valorFormatado = String.format("%.2f", valor);
// System.out.println("Altura do Chico: " + String.format("%.2f", chico) );