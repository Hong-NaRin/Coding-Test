import java.util.Scanner;

public class Main {  // 클래스명 반드시 Main 
	
	public static void main(String[] args) {
		
		// 두 자연수 A와 B가 주어지고 A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		
	}

}