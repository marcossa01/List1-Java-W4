import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		for(int i=1; i <= x; i++) {
			if( i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
