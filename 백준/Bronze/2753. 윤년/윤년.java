import java.util.Scanner;

public class Main {  // 클래스명 반드시 Main 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
			
		if(y % 4 == 0 & y % 100 != 0 | y % 400 == 0) {
			System.out.println(1);
		}
		
		else {
			System.out.println(0);
		}
    }
}    