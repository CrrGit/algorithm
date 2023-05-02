import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int cnt = sc.nextInt();
                int m = sc.nextInt();
                int[] arr = new int[cnt];

                for(int i = 0; i < cnt; i++) {
                        arr[i] = sc.nextInt();
                }
                sc.close();

                for(int i = 0; i < cnt; i++) {
                        if(arr[i] < m) {
                                System.out.print(arr[i]);
                                if(i != cnt - 1) {
                                        System.out.print(" ");
                                }
                        }
                }

	}

}