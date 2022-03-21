package ex2;


public class App {
	public static void main(String[] args) {
		Documento docment = new Documento();
		Cliente c1 = new Cliente("Vanessa", 1960, 680.00);
		Cliente c2 = new Cliente("Kerstin", 1390, 550.00);
		
		c2.clienteInfo();
		docment.transferir(c1, c2, 320);
		c2.clienteInfo();
		c1.clienteInfo();

		docment.transferir(c2, c1, 130);
		c2.clienteInfo();
		c1.clienteInfo();
	}
}
