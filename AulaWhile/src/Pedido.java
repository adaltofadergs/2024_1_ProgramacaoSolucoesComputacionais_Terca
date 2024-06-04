/* *****************************************************************************
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

*/

import javax.swing.JOptionPane;

public class Pedido {

	public static void main(String[] args) {
		double qtd, total = 0, subtotal;
		int codigo = -1;
		String valorDigitado;

		while( codigo != 0 ){
			String menu = " -----Menu----- \n";
			menu += " 1 - Cachorro quente \n ";
			menu += " 2 - Hamburguer \n ";
			menu += " 3 - Cheeseburger \n ";
			menu += " 4 - Eggcheeseburger  \n ";
			menu += " 5 - Refrigerante \n ";
			menu += " 0 - Sair \n ";
			menu += " Digite sua Opção";
			valorDigitado = JOptionPane.showInputDialog( menu );
			if( valorDigitado.isEmpty() ){
				JOptionPane.showMessageDialog(null , 
							"Opção Inválida");
			}else{ 
				codigo = Integer.valueOf( valorDigitado );
				if( codigo > 0  && codigo < 6 ){
					valorDigitado = JOptionPane.showInputDialog("Informe a quantidade");
					qtd = Double.valueOf( valorDigitado );
					switch (codigo) {
						case 1:
							subtotal = qtd * 1.5;
							break;
						case 2:
							subtotal = qtd * 2.0;
							break;
						case 3:
							subtotal = qtd * 2.5;
							break;
						case 4:
							subtotal = qtd * 3.0;
							break;
						case 5:
							subtotal = qtd * 1.5;
							break;
						default:
							subtotal = 0;
							break;
					}
					total += subtotal;
					String texto = "Subtotal: " + subtotal + "\nTotal do Pedido: " + total; 
					JOptionPane.showMessageDialog(null, texto);
				}
			}
		}
	}
}
