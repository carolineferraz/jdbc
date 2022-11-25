package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	Connection conn; //Conexão com o banco de dados
	PreparedStatement stmt; //Acessa a tabela (insert, update, delete, select)
	ResultSet rs; //Consulta a tabela (select)
	CallableStatement call; //Procedures e Function
	
	public void open() throws Exception {
		String url = "jdbc:mysql://localhost:3306/cadastros";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Erro ao conectar com o banco");
		}
	}
	
	public void close() throws Exception {
		conn.close();
	}
	

}
