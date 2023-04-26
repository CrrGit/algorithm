import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int h, m;
		Scanner sc = new Scanner(System.in);
		
		do {
			h = sc.nextInt();
			m = sc.nextInt();
		} while((0 > h || h > 24) || (0 > m || m > 60));

		sc.close();

		if(m < 45) {
			if(h == 0) {
				h = 24;
			}
			h = h - 1;
			m = m + 60;
		}
		System.out.println(h + " " + (m - 45));

    }
}