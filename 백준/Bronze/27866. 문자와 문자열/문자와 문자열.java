import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s;
        int i;
        Scanner sc = new Scanner(System.in);
        
        s = sc.nextLine();
        i = sc.nextInt();
        System.out.println(s.substring(i-1, i));
        sc.close();
	}

}