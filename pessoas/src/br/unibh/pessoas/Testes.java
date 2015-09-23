package br.unibh.pessoas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;

public class Testes {

	/**
	 * 
	 * PESSOA FISICA
	 *
	 **/
	
	@Test
	@Ignore
	public void teste(){
		System.out.println("esasadas daas as");
	}
	
	@Test
	public void lista() {
		
		try {
			PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
			List<PessoaFisica> lista = pessoafisicaDAO.findAll();
			System.out.println("Total de registros Encontrados" + lista.size());
			System.out.println("Nenhum registro encontrado");
			for(PessoaFisica pessoa : lista){
				System.out.println(pessoa.getId() +  " aaaa "+ pessoa.getNome() );
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		

	}

	@Test
	@Ignore
	public void inserir() {

		PessoaFisica pf = new PessoaFisica(null, "vinicius", "vinicius", "vinicius", "vinicius", "vinicius", new Date(),
				"M");

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		pessoafisicaDAO.insert(pf);

	}

	@Test
	@Ignore
	public void buscar() {
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pessoafisica = pessoafisicaDAO.find(101L);
		Assert.assertEquals(pessoafisica.getNome(), "vinicius");
		System.out.println(pessoafisica.getEmail() + " - " + pessoafisica.getNome());
	}

	@Test
	@Ignore
	public void editar() {

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pf2 = pessoafisicaDAO.find(101L);

		if (pf2 == null) {

			System.out.println("Nenhum registro encontrado");
		} else {
			try {

				pf2.setNome("Novo nome");
				pf2.setCpf("012.326.565-95");

				pessoafisicaDAO.update(pf2);

				System.out.println("Pessoa fisica alterada com sucesso");

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Erro ao registrar no banco de dados" + e);
			}
		}

	}
	
	@Test
	@Ignore
	public void excluir() {

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pf2 = pessoafisicaDAO.find(101L);

		if (pf2 == null) {

			System.out.println("Nenhum registro encontrado");

		} else {
			try {

				pessoafisicaDAO.delete(pf2);

				System.out.println("Pessoa fisica exluida com sucesso");

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Erro ao registrar no banco de dados" + e);
			}
		}

	}
	
	
	/*
	 * 
	 * pESSOA JURIDICA
	 * 
	 */
	
	@Test
	@Ignore
	public void listaJ() {
		
		try {
			PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
			List<PessoaFisica> lista = pessoafisicaDAO.findAll();
			System.out.println("Total de registros Encontrados" + lista.size());
			System.out.println("Nenhum registro encontrado");
			for(PessoaFisica pessoa : lista){
				System.out.println(pessoa.getId() +  " aaaa "+ pessoa.getNome() );
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		

	}

	@Test
	@Ignore
	public void inserirJ() {

		PessoaFisica pf = new PessoaFisica(null, "vinicius", "vinicius", "vinicius", "vinicius", "vinicius", new Date(),
				"M");

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		pessoafisicaDAO.insert(pf);

	}

	@Test
	@Ignore
	public void buscarJ() {
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pessoafisica = pessoafisicaDAO.find(101L);
		Assert.assertEquals(pessoafisica.getNome(), "vinicius");
		System.out.println(pessoafisica.getEmail() + " - " + pessoafisica.getNome());
	}

	@Test
	@Ignore
	public void editarJ() {

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pf2 = pessoafisicaDAO.find(101L);

		if (pf2 == null) {

			System.out.println("Nenhum registro encontrado");
		} else {
			try {

				pf2.setNome("Novo nome");
				pf2.setCpf("012.326.565-95");

				pessoafisicaDAO.update(pf2);

				System.out.println("Pessoa fisica alterada com sucesso");

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Erro ao registrar no banco de dados" + e);
			}
		}

	}
	
	@Test
	@Ignore
	public void excluirJ() {

		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		PessoaFisica pf2 = pessoafisicaDAO.find(101L);

		if (pf2 == null) {

			System.out.println("Nenhum registro encontrado");

		} else {
			try {

				pessoafisicaDAO.delete(pf2);

				System.out.println("Pessoa fisica exluida com sucesso");

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Erro ao registrar no banco de dados" + e);
			}
		}

	}
}
