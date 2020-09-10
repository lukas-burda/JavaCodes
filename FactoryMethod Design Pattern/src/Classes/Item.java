package Classes;

public class Item implements I_Item {

	public String nome = "";
	public double preco = 0.0;
	
	@Override
	public String Nome() {
		return nome;
	}

	@Override
	public double Preco() {
		return preco;
	}


}

