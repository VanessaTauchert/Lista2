package ex3;

public class App {
	public static void main(String[] args) {
		Bateria b = new Bateria(100);
		Celular c = new Celular(600, "Vanessa", b);
		c.ligar();
		c.desligar();
		
		/* descarregar*/ 
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();
		c.ligar();

	}
}
