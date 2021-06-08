package principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bd.Conexao;

public class Principal {

	public static void main(String[] args) {
		
		// Iniciar conexão
        Conexao.iniciarConexao();
        
        // SQL 1
        String sql1 = "INSERT INTO usuarios VALUES (?, ?)";
        
        // SQL 2
        String sql2 = "SELECT * FROM usuarios";
        
        // Tentativa
        try {
        // Instanciar / PreparedStatement - Executa uma instrução SQL com parâmetros
        PreparedStatement pstmt = Conexao.conexao.prepareStatement(sql1);
        pstmt.setString(1, "Lucas");
        pstmt.setInt(2, 22);
        pstmt.execute();
        
        // Statemente - Executa uma instrução SQL com parâmetros
        Statement stmt = Conexao.conexao.createStatement();
        
        // ResultSet - Armazena resultados vindos de uma consulta SQL
        ResultSet rs = stmt.executeQuery(sql2);
        
        // Listar
        while(rs.next()) {
        	System.out.println(rs.getString(1) + " - " + rs.getInt(2));
        }
        
        }catch(Exception erro) {}
        
        // Finalizar conexão
        Conexao.finalizarConexao();
	}

}
