import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 1번째 방법
		String id;
		Scanner sc = new Scanner(System.in);

		do {
			id = sc.nextLine();
		} while (id.length() > 50);
		id = id.toLowerCase();

		sc.close();
		System.out.println(id + "??!");

    }
}