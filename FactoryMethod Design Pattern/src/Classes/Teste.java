package Classes;

public class Teste {

	public static void main(String[] args) {
		Maquina mb = new Maquina();
		I_Item item_pedido = mb.EntregaItem("Salgadinho");
		System.out.println(item_pedido.Nome() + " - R$: " + item_pedido.Preco());
		mb.Itens.add(item_pedido);

		item_pedido = mb.EntregaItem("Cafe");
		System.out.println(item_pedido.Nome() + " - R$: " + item_pedido.Preco());
		mb.Itens.add(item_pedido);

		item_pedido = mb.EntregaItem("Refrigerante");
		System.out.println(item_pedido.Nome() + " - R$: " + item_pedido.Preco());
		mb.Itens.add(item_pedido);

		DebitoP deb = new DebitoP(mb.Checkout());
		deb.Pagar(deb);

		CreditoP cred = new CreditoP(mb.Checkout());
		cred.Pagar(cred);

		CDigitalP cdig = new CDigitalP(mb.Checkout());
		cdig.Pagar(cdig);

	}
}
