import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		int x;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
		
	}
}