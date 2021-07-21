package principal;

import entidades.CaixaEletronico;

public class Principal {

	public static void main(String[] args) {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		/*
		 * Deve ser possível realizar depósitos.
		 * Critérios de aceitação:
		 * 1 - O depósito deve ser feito informando uma quantidade de notas e o valor de cada nota(valores e quantidades maiores que 0).
		 * 2 - O caixa deve ter um limite de R$ 10.000,00 de saldo total.
		 * 3 - Caso o depósito a ser feito tem um valor que faça com que o limite seja excedido, não deve ser realizado.
		 * Bonus
		 * 4 - Deve ser mantido um histórico de depositos feitos.
		 * 
		 */
		
		/*
		 * Deve ser possível realizar saques.
		 * Critérios de aceitação:
		 * 1 - Um valor deve ser definido para o saque, maior que 0.
		 * 2 - As notas deve ser consumidas das maiores para as menores.
		 * 3 - Se o saque for maior que o saldo total, não deve ser realizado.
		 * 4 - Se o valor do saque não seja possível com as notas disponíveis, não deve ser realizado.
		 * 	   Ex. Saque de 15 com apenas uma nota de 20 no caixa
		 * Bonus:
		 * 5 - Deve ser mantido um histórico de saques feitos.
		 */
		
		/*
		 * Deve ser possível consultar o saldo total do caixa eletônico
		 * Critérios de aceitação:
		 * 1 - O saldo total deve ser exibido de duas formas:
		 * 		a - Em valor total.
		 * 			Ex. Saldo total de R$ 200,00.
		 * 		b - Diferênciado por notas
		 * 			Ex. Saldo de Notas:
		 * 				R$ 2,00 - 1
		 * 				R$ 5,00 - 5
		 * Bonus:
		 * 2 - Deve ser mantido um histórico de saldo.
		 */

	}

}
