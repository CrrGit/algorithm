import java.util.Scanner;

public class Main {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[sc.nextInt()];
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int stt = sc.nextInt();
			int end = sc.nextInt();
			int num = sc.nextInt();
			for(int j = stt - 1; j < end; j++) {
				arr[j] = num;
			}
		}
		sc.close();

		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}