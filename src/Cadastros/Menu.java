package Cadastros;

import java.util.List;

public class Menu {
	
	public static void main(String[] args) {
		
		PessoaDao pd = new PessoaDao();
		/*
		try {
			
			//incluir uma pessoa no banco:
			Pessoa p1 = new Pessoa(3, "Duda", "duda@email.com");
			Pessoa p2 = new Pessoa(4, "Ana", "ana@email.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			
			
			
			//fazer um update de uma pessoa no banco: 
			Pessoa pessoa = pd.consultarPessoaIndividual(3);
			if(pessoa != null) {
				pessoa.setNome("Maria");
				pessoa.setEmail("maria@email.com");
				pd.alterarPessoa(pessoa);
				
				List<Pessoa> listaPessoas = pd.ListarPessoas();
				
				for(Pessoa p: listaPessoas) {
					
					System.out.println("\nId: " + p.getId() + "\nNome: " + p.getNome() + "\nE-mail: " + p.getEmail());
				}
			}
			
			
			
			// excluir uma pessoa no banco:	
			Pessoa pessoa1 = pd.consultarPessoaIndividual(4);
				
			pd.excluirPessoa(pessoa1);
				
			List<Pessoa> listaPessoas = pd.ListarPessoas();
				
			for(Pessoa p: listaPessoas) {
				System.out.println("\nId: " + p.getId() + "\nNome: " + p.getNome() + "\nE-mail: " + p.getEmail());
			}

					
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// listar uma pessoa pelo id:
		try {
			Pessoa pes1 = pd.consultarPessoaIndividual(1);
			System.out.println("Código: " + pes1.getId());
			System.out.println("Nome: " + pes1.getNome());
			System.out.println("E-mail: " + pes1.getEmail());
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		*/
		// listar todas as pessoas:
		List<Pessoa> listaDePessoas = pd.ListarPessoas();
		for(Pessoa p : listaDePessoas) {
			System.out.println("Código: " + p.getId());
			System.out.println("Nome: " + p.getNome());
			System.out.println("E-mail: " + p.getEmail());
			System.out.println("----------------------");
		}
 		
	}

}
