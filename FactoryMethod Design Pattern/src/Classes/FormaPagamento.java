package Classes;

import java.util.Calendar;

public class FormaPagamento implements I_Pagamento {

	String cpf = "";
	double valor = 0.0;
	String data = Calendar.getInstance().getTime().toString();

	@Override
	public boolean Pagar(I_Pagamento inter) {
		// TODO Auto-generated method stub
		return false;
	}

}
