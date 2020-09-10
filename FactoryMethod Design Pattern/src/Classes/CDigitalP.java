package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CDigitalP extends FormaPagamento {

	String id = "";
	String email = "";
	String moeda = "";

	CDigitalP(){
		
	}
	
	CDigitalP(double v){
		this.cpf = "333";
		this.email = "emailtitular@email.com";
		this.id = "000";
		this.moeda = "dólar";
		this.valor = v;
	}
	
	@Override
	public boolean Pagar(I_Pagamento inter){

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/maquinavendas",
					"root",
					"");
			Statement comando = con.createStatement();

			String sql = "insert into Transacao"
					+" values ( '"
					+this.cpf
					+"','"+data
					+"','"+"Carteira Digital"
					+"','"+valor
					+"');";


			System.out.println(sql);
			comando.execute(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
