import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		int n;
		String str = "int";

		Scanner sc = new Scanner(System.in);

		do{
			n = sc.nextInt();
		} while((n % 4 != 0) && 4 > n || n > 1000);
		sc.close();

		for(int i=0; i<(n/4); i++) {
			str = "long " + str;
		}
		System.out.println(str);
	}
}