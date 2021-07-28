package com.exemplo.entidades;

import com.exemplo.entidades.abstratas.Operacao;

public class Saque extends Operacao {

	private int valor;

	public Saque(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void mostrarOperacao() {
		System.out.printf("Saque de R$ %.2f\n", (float) valor);
	}

}
