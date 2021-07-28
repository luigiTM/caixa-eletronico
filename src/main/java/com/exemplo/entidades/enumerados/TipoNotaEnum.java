package com.exemplo.entidades.enumerados;

public enum TipoNotaEnum {

	DOIS(2), CINCO(5), DEZ(10), VINTE(20), CINQUENTA(50), CEM(100), DUZENTOS(200);

	private int valor;

	private TipoNotaEnum(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}
