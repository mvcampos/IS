package br.unibh.pessoas;

import java.util.Date;

import br.unibh.pessoas.entidades.PessoaFisica;

public class Main {
	
	public static void main(String[] args){
		
		PessoaFisica pf1 = new PessoaFisica(1L, "Vinicius", "end", "31333333", "0849566663521", "vinicius@mvcmapos.com.br", new Date(), "m");
		System.out.println(pf1);
	}

}
