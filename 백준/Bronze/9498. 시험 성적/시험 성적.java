import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int s;
		Scanner sc = new Scanner(System.in);
		
		do {
			s = sc.nextInt();
		} while(0 > s || s > 100);

		if(90 <= s && s <= 100) {
			System.out.println("A");
		} else if(80 <= s && s <= 89) {
			System.out.println("B");
		} else if(70 <= s && s <= 79) {
			System.out.println("C");
		} else if(60 <= s && s <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
    }
}