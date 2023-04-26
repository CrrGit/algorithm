import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		if(a == b && a == c) {
			System.out.println(10000 + (a * 1000));
		} else if(a == b || a == c || b == c) {
			if(a == b || a == c) {
				System.out.println(1000 + (a * 100));
			} else { // b == c
				System.out.println(1000 + (b * 100));
			}
		} else {
			int max = 0;
			if(a > max) {
				max = a;
			}
			if(b > max) {
				max = b;
			}
			if(c > max) {
				max = c;
			}
			System.out.println(max * 100);
		}

    }
}