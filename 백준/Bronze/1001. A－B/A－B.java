import java.util.Scanner;

public class Main {  // 클래스명 반드시 Main 
	
	public static void main(String[] args) {
		
		//두 정수 A와 B를 입력받은 다음, A+B를 출력
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.print(a - b);
		
	}
}
