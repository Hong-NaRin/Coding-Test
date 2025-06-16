import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 주사위 세개
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = 0;
		int max = 0;
		
		if(a == b && b == c) {
			result = 10000+ a*1000;
		}
		else if(a != b && b != c && a != c) {
			if(a > b && a > c) max = a;
			else if(b > a && b > c) max = b;
			else max = c;
			result = max * 100;
		}
		else if((a == b && a != c) || (a == c && a != b)) {
			result = 1000 + a *100;
		}
		else if(b == c && c != a) {
			result = 1000 + b *100;
		}
		System.out.println(result);
    }
}