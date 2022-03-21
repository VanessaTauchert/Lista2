package ex1;

public class App {
	public static void main(String[] args) {
		Partido partido = new Partido("Roxo", "Compromisso", 51);
		Partido partido2 = new Partido("Verde", "Diversidade", 20);
		Partido partido3 = new Partido("Amarelo", "Empregabilidade", 15);
		
		Candidato candidato = new Candidato("Vanessa", partido);
		Candidato candidato2 = new Candidato("Kerstin", partido2);
		
		/* informacao candidato*/  
		
		candidato.candidatoInfo();
		candidato2.candidatoInfo();
		
		/* troca partido */  
		
		
		candidato.trocaPartido(partido3);
		candidato2.trocaPartido(partido);
		candidato.candidatoInfo();
		candidato2.candidatoInfo();
	}
}
