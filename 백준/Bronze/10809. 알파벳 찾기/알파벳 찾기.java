import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		for (int i = 0; i < 26; i++) {
			char ch = (char) (i + 97);
			System.out.print(str.indexOf(ch) + " ");
		}
	}
}