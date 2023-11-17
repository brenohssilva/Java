package fundamentos;

public class NotacaoPontos {
	
	public static void main(String[] args) {
		
	
		
		String s = "Bom dia X";
		
	    s = s.toUpperCase();
	    s = s.replace("X", "Senhora");
	    s = s.concat(" !!! ");
	    
	    System.out.println(s);
	    
	   
	    String x = "Breno".toUpperCase();
	    System.out.println(x);
	    
	    String y = "Bom dia X" .replace("X", "Breno").toUpperCase().concat(" !!!");
	    System.out.println(y);
	    
	    
	    // Tipos primitivos não tem o operador " . "
	    
	    int a = 3;
	    System.out.println(a);
	 
	 
		
		
		
		
		
	}

}
