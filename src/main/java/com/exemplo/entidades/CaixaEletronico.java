package com.exemplo.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.exemplo.entidades.abstratas.Operacao;
import com.exemplo.entidades.enumerados.TipoNotaEnum;
import com.exemplo.entidades.enumerados.TipoOperacaoEnum;

public class CaixaEletronico {

	private Map<TipoNotaEnum, Integer> notasQuantidades;
	private List<Operacao> operacoes;

	public CaixaEletronico() {
		notasQuantidades = new EnumMap<>(TipoNotaEnum.class);
		Arrays.asList(TipoNotaEnum.values()).forEach(tipoNota -> {
			notasQuantidades.put(tipoNota, 0);
		});
		operacoes = new LinkedList<>();
	}

	public float getSaldo() {
		float saldo = 0;
		for (Map.Entry<TipoNotaEnum, Integer> entry : notasQuantidades.entrySet()) {
			saldo += entry.getKey().getValor() * entry.getValue();
		}
		return saldo;
	}

	public void depositar(Deposito deposito) {
		if ((getSaldo() + deposito.getTotal()) > 10000f) {
			throw new RuntimeException();
		}
		deposito.getNotaQuantidades().forEach(notaQuantidade -> {
			Integer quantidadeDeNotas = notasQuantidades.get(notaQuantidade.getTipoNota());
			if (Objects.isNull(quantidadeDeNotas)) {
				quantidadeDeNotas = 0;
			}
			quantidadeDeNotas += notaQuantidade.getQuantidade();
			notasQuantidades.put(notaQuantidade.getTipoNota(), quantidadeDeNotas);
		});
		operacoes.add(deposito);
	}

	public void sacar(Saque saque) {
		if (saque.getValor() <= 0) {
			throw new RuntimeException();
		}
		if (saque.getValor() > getSaldo()) {
			throw new RuntimeException();
		}
		int valorSacado = saque.getValor();
		List<TipoNotaEnum> tipoDeNotas = notasQuantidades.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<NotaQuantidade> notasParaSaque = new ArrayList<>();
		for (TipoNotaEnum tipoNota : tipoDeNotas) {
			int valor = tipoNota.getValor();
			if (valorSacado >= valor && notasQuantidades.get(tipoNota) > 0) {
				int notasSacadas = valorSacado / valor;
				notasParaSaque.add(new NotaQuantidade(tipoNota, notasSacadas));
				valorSacado -= valor * notasSacadas;
			}
		}
		if (valorSacado > 0) {
			throw new RuntimeException();
		}
		notasParaSaque.forEach(notaParaSaque -> {
			Integer notas = notasQuantidades.get(notaParaSaque.getTipoNota());
			notas -= notaParaSaque.getQuantidade();
			notasQuantidades.put(notaParaSaque.getTipoNota(), notas);
			System.out.printf("Saque de %d notas de R$ %.2f\n", notaParaSaque.getQuantidade(), (float) notaParaSaque.getTipoNota().getValor());
		});
		operacoes.add(saque);
	}

	public void saldoTotal() {
		System.out.printf("Saldo total de R$ %.2f\n", getSaldo());
	}

	public void saldoDiferenciado() {
		System.out.println("Saldo de Notas:");
		for (Map.Entry<TipoNotaEnum, Integer> entry : notasQuantidades.entrySet()) {
			System.out.printf("R$ %.2f - %d\n", (float) entry.getKey().getValor(), entry.getValue());
		}
	}

	public void historico() {
		operacoes.forEach(Operacao::mostrarOperacao);
	}

	public void historico(TipoOperacaoEnum tipoOperacao) {
		operacoes.stream().filter(operacao -> filtroOperacao(operacao, tipoOperacao)).forEach(Operacao::mostrarOperacao);
	}

	private boolean filtroOperacao(Operacao operacao, TipoOperacaoEnum tipoOperacao) {
		switch (tipoOperacao) {
		case DEPOSITO:
			return operacao instanceof Deposito;
		case SAQUE:
			return operacao instanceof Saque;
		default:
			return false;
		}
	}

}
