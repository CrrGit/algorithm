import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int a, b;
		int cnt = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        int []arr = new int[a];

        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        
        b = sc.nextInt();
        for(int i = 0; i < a; i++) {
            if(arr[i] == b) {
                cnt ++;
            }
        }
        sc.close();
        System.out.println(cnt);
	}

}