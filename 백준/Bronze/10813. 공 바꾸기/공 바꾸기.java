import java.util.Scanner;

public class Main {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[sc.nextInt()];
		int a = sc.nextInt();

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int tmp = arr[x - 1];
			arr[x - 1] = arr[y - 1];
			arr[y - 1] = tmp;
		}
		sc.close();

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}