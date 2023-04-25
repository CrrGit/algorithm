import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
        
        double a, b;
        
		// 1번째 방법
		Scanner sc = new Scanner(System.in);

		do {
			a = sc.nextDouble();
			b = sc.nextDouble();
		} while(a < 0 || b > 10);
		
		sc.close();
		System.out.println(a / b);

		// 2번째 방법
		/* 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		a = Double.parseDouble(st.nextToken());
		b = Double.parseDouble(st.nextToken());
		
		System.out.println(a/b); 
		*/

    }
}