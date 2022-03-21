package ex4;

public class App {
	public static void main(String[] args) {
		Loja loja = new Loja();
		Livro l1 = new Livro("Mogly", Formato.EPUB, true);
		Livro l2 = new Livro("Moglik", Formato.PDF, true);
		Livro l3 = new Livro("Cronicas de Narnia", Formato.FISICO, false);

	
		l1.livroInfo();
		loja.disponibilidade(l1);
		l2.livroInfo();
		loja.disponibilidade(l2);
		l3.livroInfo();
		loja.disponibilidade(l3);

		loja.disponivel(l3);
		l3.livroInfo();
		loja.disponibilidade(l3);
	}
}
