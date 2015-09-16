package br.unibh.pessoas;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;

public class Testes {
	
	
	@Test
	@Ignore
	public void lista(){
		
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		List<PessoaFisica> lista = pessoafisicaDAO.findAll();
		Assert.assertEquals(lista.size(), 100);
		
	}
	
	@Test
	public void buscar(){
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pessoafisica = pessoafisicaDAO.find(1L);
		Assert.assertEquals(pessoafisica.getNome(), "Tatiana T. Mayer");
		System.out.println(pessoafisica.getEmail() + " - " + pessoafisica.getNome());
	}
}
