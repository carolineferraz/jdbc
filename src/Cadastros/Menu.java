package Cadastros;

import java.util.List;

public class Menu {
	
	public static void main(String[] args) {
		
		PessoaDao pd = new PessoaDao();
		
		try {
			//incluir uma pessoa:
			Pessoa p1 = new Pessoa(3, "Duda", "duda@email.com");
			Pessoa p2 = new Pessoa(4, "Ana", "ana@email.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			
			/*
			Pessoa pessoa = pd.consultarPessoaIndividual(2);
			System.out.println("pessoa: " + pessoa);
			pessoa.setEmail("ana2@email.com");
			
			System.out.println("pessoa: " + pessoa);
			pd.alterarPessoa(pessoa);
			
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			for(Pessoa p: listaPessoas) {
				System.out.println(p);
			}
			
			*/
			/*
			
			Pessoa pessoa1 = pd.consultarPessoaIndividual(2);
			
			pd.excluirPessoa(pessoa1);
			
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
			for(Pessoa p: listaPessoas) {
				System.out.println(p);
			}
			
			*/
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
