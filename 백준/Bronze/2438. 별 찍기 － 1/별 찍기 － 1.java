import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();

        for(int i = 1; i <= x; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}