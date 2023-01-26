package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	
	Produto (String nomeInicial, double precoInicial, double descontoInicial ){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
			
	}
	Produto (){
		
	}
	
	// aula 96
	// outros tipos de metodos
	// olhar a aula
	double precoComdesconto() {
		return preco * (1 - desconto);
		
	}

}
