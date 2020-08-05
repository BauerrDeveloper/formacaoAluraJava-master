package br.com.rodrigo.java.io;


import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Rodrigo Paulo Bauernfeind

 * @version 0.1
 */
public class Cliente implements Serializable {


	private static final long serialVersionUID = -5520855031396666737L; //serialização da classe. administrar a versão da classe.
	private String nome;
	private String cpf;
	private String profissao;
	private String titular;

	public String getNomeCPF () {return this.nome + ", CPF: " + this.cpf;}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
