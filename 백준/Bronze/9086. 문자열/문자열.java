import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int a;
		String s;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            s = sc.next();
            s = s.toUpperCase();
            System.out.println(s.substring(0, 1) + s.substring(s.length()-1, s.length()));
        }
        sc.close();
	}

}