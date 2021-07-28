package com.exemplo.entidades;

import java.util.List;

import com.exemplo.entidades.abstratas.Operacao;

public class Deposito extends Operacao {

	private List<NotaQuantidade> notaQuantidades;

	public Deposito(List<NotaQuantidade> notaQuantidades) {
		this.notaQuantidades = notaQuantidades;
	}

	public List<NotaQuantidade> getNotaQuantidades() {
		return notaQuantidades;
	}

	public Integer getTotal() {
		return notaQuantidades.stream().mapToInt(notaQuantidade -> {
			return notaQuantidade.getTipoNota().getValor() * notaQuantidade.getQuantidade();
		}).sum();
	}

	@Override
	public void mostrarOperacao() {
		System.out.println("Depósito:");
		notaQuantidades.forEach(notaQuantidade -> {
			System.out.printf("\t%d notas de R$ %.2f\n", notaQuantidade.getQuantidade(), (float) notaQuantidade.getTipoNota().getValor());
		});
	}

}
