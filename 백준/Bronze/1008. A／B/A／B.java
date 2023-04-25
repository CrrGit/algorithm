import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);

		do {
			a = sc.nextDouble();
			b = sc.nextDouble();
		} while(a < 0 || b > 10);
		
		sc.close();
		System.out.println(a / b);

    }
}