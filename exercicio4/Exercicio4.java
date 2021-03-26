package exercicio4;


import java.util.*;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
	int n;
	String repeticao;
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Entre com número de repetições: ");
	n = scan.nextInt();
		
	repeticao = "incomoda ";
	while(n-- > 0) {
		System.out.print(repeticao);
	}
	System.out.print("muito mais");
	
	scan.close();
	
	}
}
