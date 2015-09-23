package br.unibh.pessoas;

import java.util.Date;
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
	@Ignore
	public void buscar(){
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pessoafisica = pessoafisicaDAO.find(1L);
		Assert.assertEquals(pessoafisica.getNome(), "Tatiana T. Mayer");
		System.out.println(pessoafisica.getEmail() + " - " + pessoafisica.getNome());
	}
	
	@Test
	@Ignore
	public void inserir(){
		
		PessoaFisica pf = new PessoaFisica(null, "vinicius", "vinicius", "vinicius", "vinicius", "vinicius", new Date(), "M");
		
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		pessoafisicaDAO.insert(pf);
		
	}
	
	@Test
	public void editar() {
		
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Ciclano da Silva", "Rua A", "7070707070", "10010010010",
				"ciclano@ciclano.com.br", new Date(), "M");
		dao.insert(pf);
		
		PessoaFisica pf2 = dao.find(1L);
		pf2.setNome("Beltrano da Silva");
		pf2.setEmail("beltrano@beltrano.com.br");
		dao.update(pf2);
	

	}
	
	
}
