package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreditoP extends FormaPagamento {

	String numcart = "";
	String codseg = "";

	CreditoP(){

	}

	CreditoP(double v){
		this.cpf = "222";
		this.numcart = "0000 0000 0000 0000";
		this.codseg = "231";
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
					+"','"+"Crédito"
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
