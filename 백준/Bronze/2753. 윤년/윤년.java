import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int y;
		Scanner sc = new Scanner(System.in);
		
		do {
			y = sc.nextInt();
		} while(0 > y && y > 4000);
		sc.close();
		
		// 윤년의 경우 4배수 100의 배수 아니고 400배수일 때
		if(((y % 4) == 0)  && ((y % 100) != 0) || ((y % 400) == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
    }
}