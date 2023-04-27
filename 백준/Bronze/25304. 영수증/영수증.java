import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		int total, cnt, a, b;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		total = sc.nextInt();
		cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = sum + (a * b);
		}
		sc.close();

		if(total == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}