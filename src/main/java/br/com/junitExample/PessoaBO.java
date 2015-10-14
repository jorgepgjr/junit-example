package main.java.br.com.junitExample;

import java.util.List;

public class PessoaBO {
	PessoaDAO dao = null;

	public PessoaBO(PessoaDAO pessoaDAO) {
		dao = pessoaDAO;
	}

	public Pessoa recuperaPessoaMaisVelha() {
		
		Pessoa jorge = new Pessoa("Jorge", 25L);
		
		String retorno = jorge.dizerOla();
		
		
		List<Pessoa> pessoas = dao.findAll();
		Pessoa pessoaMaisVelha = null;
		System.out.println("Quantidade de pessoas retornadas: "
				+ pessoas.size());
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + "  " + pessoa.getIdade());
			if (pessoaMaisVelha == null) {
				pessoaMaisVelha = pessoa;
			} else if (pessoaMaisVelha.getIdade() < pessoa.getIdade()) {
				pessoaMaisVelha = pessoa;
			}
		}
		System.out.println("Pessoa mais velha: " + pessoaMaisVelha.getNome());
		return pessoaMaisVelha;
	}
}
