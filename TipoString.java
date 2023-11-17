package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Boa tarde";
		
		
	 System.out.println(s.concat("!!!"));
	 System.out.println(s +"!!!");
	 System.out.println(s.startsWith("Boa"));
	 System.out.println(s.toLowerCase().startsWith("boa")); //tirando o TolowerCase fica false.
	 System.out.println(s.toUpperCase().endsWith("TARDE"));
	 System.out.println(s.length());
	 System.out.println(s.equals("boa tarde"));
	 System.out.println(s.equalsIgnoreCase("boa tarde"));
		
	
	 
	 var nome = "Breno";
	 var sobrenome = "Santos";
	 var idade = 33;
	 var salario = 12395.987;
	 
	 
	 System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " +idade + " Salario: " + salario );
	 
	 System.out.printf("Nome: %s", nome);
	}

}
