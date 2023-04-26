import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		long a, b, c;
		Scanner sc = new Scanner(System.in);

		do {
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
		} while (1 > a || 1 > b || 1 > c || a > Math.pow(10,12) || b > Math.pow(10,12) || c > Math.pow(10, 12));
		sc.close();
		
		System.out.println(a + b + c);
		 
    }
}