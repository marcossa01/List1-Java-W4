import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		for(int i = 2; i < x; i++) {
			boolean primo = true;
			
			for(int y = 2; y < i; y++) {
				
				if(i % y == 0) {
					primo = false;
					break;
				}
			}
			
			if (primo) {
				System.out.printf("O número %d é primo\n", i);
			}
			
		}
		
		sc.close();

	}

}
