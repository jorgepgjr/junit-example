package test.java.br.com.junitExample;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import main.java.br.com.junitExample.Pessoa;
import main.java.br.com.junitExample.PessoaBO;
import main.java.br.com.junitExample.PessoaDAO;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PessoaBOTest {

	@Mock
	PessoaDAO pessoaDAO;
	@InjectMocks
	PessoaBO pessoaBO = new PessoaBO(pessoaDAO);

	@Test
	public void recuperaPessoaMaisVelhaTest() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Pessoa Mocada 3", 12L));
		pessoas.add(new Pessoa("Pessoa Mocada 4", 20L));
		pessoas.add(new Pessoa("Pessoa Mocada 5", 80L));

		when(pessoaDAO.findAll()).thenReturn(pessoas);
		Pessoa pessoaMaisVelha = pessoaBO.recuperaPessoaMaisVelha();
		Assert.assertTrue(pessoaMaisVelha.getIdade() == 80L);

	}
}
