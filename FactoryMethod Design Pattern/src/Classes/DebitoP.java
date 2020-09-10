package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DebitoP extends FormaPagamento {

	String agensaq = "";
	String bancosaq = "";
	String contasaq = "";
	String bancodep = "";
	String agendep = "";
	String contadep = "";
	String cpfdep = "";	

	DebitoP(){
		
	}
	
	DebitoP(double v){
		this.cpf = "111";
		this.agendep = "000";
		this.bancodep = "000";
		this.contadep = "000";
		this.cpfdep = "000";
		this.agensaq = "000";
		this.bancosaq = "000";
		this.contasaq = "000";
		this.valor = v;
	}

	@Override
	public boolean Pagar(I_Pagamento inter) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/maquinavendas",
					"root",
					"");
			Statement comando = con.createStatement();

			String sql = "insert into Transacao"
					+" values ( '"+this.cpf
					+"','"+data
					+"','"+"Débito"
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
