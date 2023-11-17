package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informações do funcionario
		// Tipos numericos inteiros
		
		byte anosDeEmpresa = 127;
		short numeroDeVoos = 3256;
		int id = 56789;
		long pontoAcumulados = 3_134_845_223L;
		
	    // Tipos numericos reais
		
		float salario = 11_445.44F; //mesmo sendo um 1.45 ainda sim é um doble
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano 
		
		boolean estaDeFerias = false; //ou true
		
		// Tipos caractere 
		
		char status = 'a';
		
		
		
		
		// Calculo dias da empresa
		
		System.out.println(anosDeEmpresa * 365);
		
        // Numero de viagens	
		
		System.out.println(numeroDeVoos / 2);
		
		// Numero por real
		
		System.out.println(pontoAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> " + salario);
		
		System.out.println("Ferias ? " + estaDeFerias);
		
		System.out.println("Status : " + status);
		
		
		
		
		
		
		
		
		
		
		
	}

}
