import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		int x;

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		sc.close();

		for(int i=1; i<=9; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
		
	}
}