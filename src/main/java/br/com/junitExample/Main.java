package main.java.br.com.junitExample;

public class Main {

	public static void main(String args[]){
		PessoaDAO dao = new PessoaDAO();
		PessoaBO bo = new PessoaBO(dao);
		bo.recuperaPessoaMaisVelha();
	}
}
