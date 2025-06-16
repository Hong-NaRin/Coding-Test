import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 문자열 반복 2675번
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			int R = scan.nextInt();
			String S = scan.next();
//			String[] str = new String[T];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));					
				}
			}
			System.out.println();
		}
    }
}