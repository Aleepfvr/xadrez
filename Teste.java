import java.util.HashMap;
import java.util.Scanner;

public class Teste {
	
	private static final int TAMANHO=10;
	private static char criarCelula[][];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean c = true;
		int linhaAnt=2,colunaAnt=2;
		char cavalo = 'C';
		
		String resp = "";
		
		HashMap<String ,Integer> map = new HashMap<String,Integer>();
		map.put("a", 1);
		map.put("b",2);
		map.put("c",3);
		map.put("d",4);
		map.put("e",5);
		map.put("f",6);
		map.put("g",7);
		map.put("h",8);
		
		criarCelula = new char[TAMANHO][TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                criarCelula[i] [j] = '-';
            }
        }
        

	        
	        for (int linha = TAMANHO - 2; linha > 0; linha--) {
	            System.out.print("       " + linha + " ");
	
	            for (int coluna = 1; coluna < TAMANHO - 1; coluna++) {
	                System.out.print("   " + criarCelula[linha][coluna]);
	            }
	            
	            criarCelula[linhaAnt][linhaAnt] = (char) (cavalo);
	            
	
	            System.out.println();
	        }
	        System.out.println("\n            a   b   c   d   e   f   g   h");
	        
	        System.out.println(" ");
        
        
        	System.out.println("Digite o local que voce quer ir:");
        	resp = sc.next();
        	System.out.println(" ");
        	
        	 for (int linha = TAMANHO - 2; linha > 0; linha--) {
 	            System.out.print("       " + linha + " ");
 	
 	            for (int coluna = 1; coluna < TAMANHO - 1; coluna++) {
 	                System.out.print("   " + criarCelula[linha][coluna]);
 	            }
 	            
 	            criarCelula[linhaAnt][colunaAnt] = '-';
 	            linhaAnt = Integer.parseInt(resp.substring(1));
 	            colunaAnt = map.get(resp.substring(0,1).toLowerCase());
 	            criarCelula[linhaAnt][colunaAnt] = (char) (cavalo);
 	            
 	            
 	            System.out.println();
 	        }
        	 System.out.println("\n            a   b   c   d   e   f   g   h");
        	
        }
        
        
        
	
}
