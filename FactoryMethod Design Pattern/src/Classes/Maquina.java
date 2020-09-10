package Classes;

import java.util.ArrayList;

public class Maquina {

	public I_Item EntregaItem(String tipoitem) {
		Item item = null;
		
		switch (tipoitem) {
		case "Cafe":
			Cafe cafe = new Cafe();
			item = cafe;
			
			break;
		case "Refrigerante":
			Refrigerante refri = new Refrigerante();
			item = refri;
			break;
		case "Salgadinho":
			Salgadinho salg= new Salgadinho();
			item = salg;
			break;
			
		default:
			break;
		}
		
		return item;
	}
	
	ArrayList<I_Item> Itens = new ArrayList<I_Item>();

	public double Checkout() {
		double total = 0.0;
		for(I_Item item : this.Itens) {
			total += item.Preco();
		}
	System.out.println("Total: "+ total);
		return total;
	}

}
