import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
        
        sc.close();
        
		if(a > 0 && b > 0) {
			System.out.println(1);
		} else if(a < 0 && b > 0) {
			System.out.println(2);
		} else if(a < 0 && b < 0) {
			System.out.println(3);
		} else if(a > 0 && b < 0) {
			System.out.println(4);
		}
    }
}