import java.util.Scanner;

public class Main {  // 클래스명 반드시 Main 
	
	public static void main(String[] args) {
		
		// 백준 - 조건문 9498번
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch(score / 10) {
		
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
    }
}