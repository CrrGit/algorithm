import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);

		do {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		} while (2 > a || a > 10000);

		sc.close();
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
		 
    }
}