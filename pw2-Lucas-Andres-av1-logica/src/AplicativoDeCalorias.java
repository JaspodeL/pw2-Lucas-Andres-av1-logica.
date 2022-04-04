import java.util.Scanner;

public class AplicativoDeCalorias {

	public static void main(String[] args) {
		
		int Q1;
		int Q2;
		int Q3;
		int X;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor Q1: ");
		Q1  = ler.nextInt();
		System.out.println("Informe o valor Q2: ");
		Q2  = ler.nextInt();
		System.out.println("Informe o valor Q3: ");
		Q3  = ler.nextInt();
		System.out.println("Informe o valor: ");
		X  = ler.nextInt();
		
		if (Q1 - Q2 <= X) {
			
			
			System.out.println("O valor de Q2 é: " + Q2);
		}
		
		else if (Q1 + Q2 > X){
			
			System.out.println("O valor de Q3 é: " + Q3);
		}
	}
}
