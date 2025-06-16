import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - OX퀴즈 8958번
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String[] arr = new String[T];
		
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.next();
		}
			
		for(int j = 0; j < arr.length; j++) {
			for(int k = 0; k < arr[j].length(); k++) {
				// j번째 일때 문자 k번째가 'O'라면?
				if(arr[j].charAt(k) == 'O') {
					cnt++;
					sum += cnt;
				}
				else if(arr[j].charAt(k) == 'X') {
					cnt = 0;
				}
			}
			System.out.println(sum);
			// 카운트와 총합 초기화를 해주지 않으면 기존 출력에서 계속 더해주므로 0으로 초기화를 해줘야 함
			sum = 0;
			cnt = 0;
		}
    }
}