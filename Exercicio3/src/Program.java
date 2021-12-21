import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		boolean primo = true;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		for(int i = 2; i < x; i++) {
			
			if (x % i == 0) {
				primo = false;
				System.out.println("O número não é primo");
				break;
			}
		}
		
		if(primo) {
			System.out.println("O número é primo");
		}
		
		sc.close();

	}

}
