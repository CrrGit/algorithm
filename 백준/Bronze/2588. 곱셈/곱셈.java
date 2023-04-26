import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a;
		String s;

		Scanner sc = new Scanner(System.in);

		do {
			a = sc.nextInt();
			s = sc.next();
		} while (a < 100 || Integer.parseInt(s) < 100 || a >= 1000 || Integer.parseInt(s) >= 1000);

		sc.close();
		for (int i = 2; i >= 0; i--) {
			System.out.println(a * (s.charAt(i) - '0'));
		}
		System.out.println(a * Integer.parseInt(s));
		 
    }
}