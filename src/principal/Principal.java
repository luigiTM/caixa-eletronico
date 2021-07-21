package principal;

import entidades.CaixaEletronico;

public class Principal {

	public static void main(String[] args) {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		/*
		 * Deve ser poss�vel realizar dep�sitos.
		 * Crit�rios de aceita��o:
		 * 1 - O dep�sito deve ser feito informando uma quantidade de notas e o valor de cada nota(valores e quantidades maiores que 0).
		 * 2 - O caixa deve ter um limite de R$ 10.000,00 de saldo total.
		 * 3 - Caso o dep�sito a ser feito tem um valor que fa�a com que o limite seja excedido, n�o deve ser realizado.
		 * Bonus
		 * 4 - Deve ser mantido um hist�rico de depositos feitos.
		 * 
		 */
		
		/*
		 * Deve ser poss�vel realizar saques.
		 * Crit�rios de aceita��o:
		 * 1 - Um valor deve ser definido para o saque, maior que 0.
		 * 2 - As notas deve ser consumidas das maiores para as menores.
		 * 3 - Se o saque for maior que o saldo total, n�o deve ser realizado.
		 * 4 - Se o valor do saque n�o seja poss�vel com as notas dispon�veis, n�o deve ser realizado.
		 * 	   Ex. Saque de 15 com apenas uma nota de 20 no caixa
		 * Bonus:
		 * 5 - Deve ser mantido um hist�rico de saques feitos.
		 */
		
		/*
		 * Deve ser poss�vel consultar o saldo total do caixa elet�nico
		 * Crit�rios de aceita��o:
		 * 1 - O saldo total deve ser exibido de duas formas:
		 * 		a - Em valor total.
		 * 			Ex. Saldo total de R$ 200,00.
		 * 		b - Difer�nciado por notas
		 * 			Ex. Saldo de Notas:
		 * 				R$ 2,00 - 1
		 * 				R$ 5,00 - 5
		 * Bonus:
		 * 2 - Deve ser mantido um hist�rico de saldo.
		 */

	}

}
