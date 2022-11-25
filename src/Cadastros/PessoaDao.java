package Cadastros;

import java.util.ArrayList;
import java.util.List;

public class PessoaDao extends Dao {

	public void incluirPessoa(Pessoa p) throws Exception {
		
		open();
		stmt = conn.prepareStatement("insert into Pessoa values(?, ?, ?)");
		stmt.setInt(1, p.getId());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public void alterarPessoa(Pessoa p) throws Exception {
		
		open();
		stmt = conn.prepareStatement("update Pessoa nome = ?, email = ? where id = ?");
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getId());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public void excluirPessoa(Pessoa p) throws Exception {
		
		open();
		stmt = conn.prepareStatement("delete from Pessoa where id = ?");
		stmt.setInt(1, p.getId());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public Pessoa consultarPessoaIndividual(int cod) throws Exception {
		
		open();
		stmt = conn.prepareStatement("select * from pessoa where id = ?");
		rs = stmt.executeQuery();
		Pessoa p = null;
		if(rs.next()) {
			p = new Pessoa();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			p.setEmail(rs.getString("email"));
		}
		close();
		return p;
	}
	
	public List<Pessoa> ListarPessoas() {
		try {
			open();
			stmt = conn.prepareStatement("select * from Pessoa");
			rs = stmt.executeQuery();
			List<Pessoa> listaPessoas = new ArrayList<>();
			while(rs.next()) {
				Pessoa p = new Pessoa();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
			}
			close();
			return listaPessoas;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
