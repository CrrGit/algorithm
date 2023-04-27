import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		int x;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		sc.close();
		
		for(int i = 0; i <= x; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}