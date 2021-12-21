import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m;
		int n;
		
		System.out.print("Informe um número: ");
		m = sc.nextInt();
		
		System.out.print("Informe um número para multiplicação: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= m; i++) {
			System.out.println((i * n));
		}
		
		sc.close();

	}

}
