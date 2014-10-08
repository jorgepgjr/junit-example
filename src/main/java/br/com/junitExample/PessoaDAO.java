package main.java.br.com.junitExample;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

	// Simulando um acesso ao BD
	public Pessoa findPessoa(Long id) {

		final Pessoa pessoa;

		if (id == 1) {
			pessoa = new Pessoa("Pessoa 1", 25L);
		} else {
			pessoa = new Pessoa("Pessoa 2", 42L);
		}
		return pessoa;
	}

	// Simulando um acesso ao BD
	public List<Pessoa> findAll() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Pessoa 1", 25L));
		pessoas.add(new Pessoa("Pessoa 2", 45L));
		return pessoas;
	}
}
