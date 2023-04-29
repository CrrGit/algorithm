import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x, a, b = 0;
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i = 1; i <= x; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
		sc.close();
	}

}