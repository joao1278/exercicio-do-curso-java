package classe;

public class data {
	//quando for criar uma classe
	// nao utiliza o sinal de igualdade (=)
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d",dia,mes,ano);
		
		
	}
	
	
	
	

}
