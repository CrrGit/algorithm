import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int h, m, t;
		Scanner sc = new Scanner(System.in);
		
		do {
			h = sc.nextInt();
			m = sc.nextInt();
		} while((0 > h || h > 24) || (0 > m || m > 60));
		t = sc.nextInt();

		sc.close();

		m = m + t;
		h = h + (m / 60);
		m = m % 60;
		if(h >= 24) {
			h = h - 24;
		}

		System.out.println(h + " " + m);

    }
}