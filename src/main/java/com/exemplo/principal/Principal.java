package com.exemplo.principal;

import java.util.ArrayList;
import java.util.List;

import com.exemplo.entidades.CaixaEletronico;
import com.exemplo.entidades.Deposito;
import com.exemplo.entidades.NotaQuantidade;
import com.exemplo.entidades.Saque;
import com.exemplo.entidades.enumerados.TipoNotaEnum;
import com.exemplo.entidades.enumerados.TipoOperacaoEnum;

public class Principal {

	public static void main(String[] args) {

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.saldoTotal();
		caixaEletronico.saldoDiferenciado();

		List<NotaQuantidade> notaQuantidades = new ArrayList<>();

//		notaQuantidades.add(new NotaQuantidade(TipoNotaEnum.CINCO, 2));
//		Deposito deposito1 = new Deposito(notaQuantidades);
//		caixaEletronico.depositar(deposito1);
//
//		caixaEletronico.saldoTotal();
//		caixaEletronico.saldoDiferenciado();

		notaQuantidades.add(new NotaQuantidade(TipoNotaEnum.DOIS, 50));
		notaQuantidades.add(new NotaQuantidade(TipoNotaEnum.CINCO, 100));
		notaQuantidades.add(new NotaQuantidade(TipoNotaEnum.DEZ, 200));
		notaQuantidades.add(new NotaQuantidade(TipoNotaEnum.CINQUENTA, 20));
		notaQuantidades.add(new NotaQuantidade(TipoNotaEnum.CEM, 10));
		
		Deposito deposito2 = new Deposito(notaQuantidades);
		caixaEletronico.depositar(deposito2);
		
		caixaEletronico.saldoTotal();
		caixaEletronico.saldoDiferenciado();

		Saque saque = new Saque(10);
		caixaEletronico.sacar(saque);

		caixaEletronico.saldoTotal();
		caixaEletronico.saldoDiferenciado();
		
		caixaEletronico.historico();
		caixaEletronico.historico(TipoOperacaoEnum.SAQUE);
		caixaEletronico.historico(TipoOperacaoEnum.DEPOSITO);

	}
}
