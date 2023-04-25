import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);

		do {
			a = sc.nextInt();
			b = sc.nextInt();
		} while(a <= 0 || b > 10000);
		
		sc.close();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

    }
}