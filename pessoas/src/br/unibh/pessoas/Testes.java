package br.unibh.pessoas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.entidades.PessoaJuridica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;
import br.unibh.pessoas.persistencia.PessoaJuridicaDAO;

public class Testes {

	/**
	 * 
	 * PESSOA FISICA
	 *
	 **/

	@Test
	public void lista_pessoafisica() {

		// List<PessoaFisica> l = dao.findAll();
		// Assert.assertEquals(l.size(), 100);

		try {
			PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
			List<PessoaFisica> lista = pessoafisicaDAO.findAll();
			System.out.println("Total de registros encontrados Pessoa Fisica: " + lista.size());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}

	}

	@Test
	public void buscar_pessoafisica() {
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pessoafisica = pessoafisicaDAO.find(1L);

		if (pessoafisica == null) {
			System.out.println("Nenhum registro encontrado");

		} else {

			System.out.println(pessoafisica.getEmail() + " - " + pessoafisica.getNome());
		}
	}

	@Test
	public void inserir_pessoafisica() {

		PessoaFisica pf = new PessoaFisica(null, "Milton Vinicius", "Rua A", "telefone", "cpf", "email", new Date(),
				"M");

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		pessoafisicaDAO.insert(pf);

		PessoaFisica pf2 = pessoafisicaDAO.find("Milton Vinicius");

		Assert.assertNotNull(pf2);
		pessoafisicaDAO.delete(pf2);

		PessoaFisica pf3 = pessoafisicaDAO.find("Milton Vinicius");
		Assert.assertNull(pf3);

	}

	@Test
	public void editar_pessoafisica() {

		PessoaFisica pf = new PessoaFisica(null, "Milton Vinicius", "Rua A", "telefone", "cpf", "email", new Date(),
				"M");

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		pessoafisicaDAO.insert(pf);

		PessoaFisica pf2 = pessoafisicaDAO.find("Milton Vinicius");
		Assert.assertNotNull(pf2);
		pf2.setCpf("01233656595");
		pf2.setNome("teste vinicius");
		pessoafisicaDAO.update(pf2);

		PessoaFisica pf3 = pessoafisicaDAO.find("teste vinicius");
		Assert.assertEquals(pf3.getCpf(), "01233656595");
		pessoafisicaDAO.delete(pf3);

		PessoaFisica pf4 = pessoafisicaDAO.find("teste vinicius");
		Assert.assertNull(pf4);
	}

	@Test
	public void excluir_pessoafisica() {

		PessoaFisica pf = new PessoaFisica(null, "Milton Vinicius", "Rua A", "telefone", "cpf", "email", new Date(),
				"M");

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		pessoafisicaDAO.insert(pf);

		PessoaFisica pf2 = pessoafisicaDAO.find("Milton Vinicius");
		Assert.assertNotNull(pf2);
		pessoafisicaDAO.delete(pf2);

		PessoaFisica pf3 = pessoafisicaDAO.find("Milton Vinicius");
		Assert.assertNull(pf3);

	}

	/*
	 * 
	 * 
	 * PESSOA JURIDICA
	 * 
	 */

	@Test
	public void lista_pessoajuridica() {

		// List<PessoaFisica> l = dao.findAll();
		// Assert.assertEquals(l.size(), 100);

		try {
			PessoaJuridicaDAO pessoajuridicaDAO = new PessoaJuridicaDAO();
			List<PessoaJuridica> lista = pessoajuridicaDAO.findAll();
			System.out.println("Total de registros encontrados pessoa juridica: " + lista.size());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}

	}

	@Test
	public void buscar_pessoajuridica() {
		PessoaJuridicaDAO pessoajuridicaDAO = new PessoaJuridicaDAO();
		PessoaJuridica pessoajuridica = pessoajuridicaDAO.find(1L);

		if (pessoajuridica == null) {
			System.out.println("Nenhum registro encontrado");

		} else {

			System.out.println(pessoajuridica.getSite() + " - " + pessoajuridica.getNome());
		}
	}

	@Test
	public void inserir_pessoajuridica() {

		PessoaJuridica pj = new PessoaJuridica(null, "Milton Vinicius", "Rua a", "telefone", "cnpj", new Date(),
				"www.site.com.br");

		PessoaJuridicaDAO pessoajuridicaDAO = new PessoaJuridicaDAO();
		pessoajuridicaDAO.insert(pj);

		PessoaJuridica pj2 = pessoajuridicaDAO.find("Milton Vinicius");
		Assert.assertNotNull(pj2);
		pessoajuridicaDAO.delete(pj2);

		PessoaJuridica pj3 = pessoajuridicaDAO.find("Milton Vinicius");
		Assert.assertNull(pj3);

	}

	@Test
	public void editar_pessoajuridica() {

		PessoaJuridica pj = new PessoaJuridica(null, "Milton Vinicius", "Rua a", "telefone", "cnpj", new Date(),
				"www.site.com.br");
		PessoaJuridicaDAO pessoajuridicaDAO = new PessoaJuridicaDAO();
		pessoajuridicaDAO.insert(pj);

		PessoaJuridica pj2 = pessoajuridicaDAO.find("Milton Vinicius");
		Assert.assertNotNull(pj2);
		pj2.setSite("www.novosite.com");
		pessoajuridicaDAO.update(pj2);

		PessoaJuridica pj3 = pessoajuridicaDAO.find("Milton Vinicius");
		Assert.assertEquals(pj3.getSite(), "www.novosite.com");
		pessoajuridicaDAO.delete(pj3);

		PessoaJuridica pj4 = pessoajuridicaDAO.find("Milton Vinicius");
		Assert.assertNull(pj4);

	}

	@Test
	public void excluir_pessoajuridica() {

		PessoaJuridica pj = new PessoaJuridica(null, "Milton Vinicius", "Rua a", "telefone", "cnpj", new Date(),
				"www.site.com.br");

		PessoaJuridicaDAO pessoajuridicaDAO = new PessoaJuridicaDAO();
		pessoajuridicaDAO.insert(pj);

		PessoaJuridica pj2 = pessoajuridicaDAO.find("Milton Vinicius");
		Assert.assertNotNull(pj2);
		pessoajuridicaDAO.delete(pj2);

		PessoaJuridica pj3 = pessoajuridicaDAO.find("Milton Vinicius");
		Assert.assertNull(pj3);

	}

}