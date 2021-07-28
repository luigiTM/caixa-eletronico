package com.exemplo.entidades;

import com.exemplo.entidades.enumerados.TipoNotaEnum;

public class NotaQuantidade {

	private TipoNotaEnum tipoNota;
	private int quantidade;

	public NotaQuantidade(TipoNotaEnum tipoNota, int quantidade) {
		this.tipoNota = tipoNota;
		this.quantidade = quantidade;
	}

	public TipoNotaEnum getTipoNota() {
		return tipoNota;
	}

	public void setTipoNota(TipoNotaEnum tipoNota) {
		this.tipoNota = tipoNota;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
