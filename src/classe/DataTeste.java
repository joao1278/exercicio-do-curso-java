package classe;

public class DataTeste {

	
	public static void main(String[] args) {
	
		data d1 = new data();
		
		d1.ano = 1987;
		d1.dia = 26;
		d1.mes = 07;
		// para exibir a data no formato certo
		// colocamos (%d) e separamos com (/) para 
		// formar o valor da data
		
		
		
		data d2 = new data();
		
		d2.ano = 1987;
		d2.dia = 05;
		d2.mes = 11;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	
		
		
	}
}
