import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 나머지 3052번
		Scanner scan = new Scanner(System.in);
//		int[] num = new int[10];
		boolean[] num = new boolean[42];
		
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			num[scan.nextInt() % 42] = true;
		}
		
		for(boolean value : num) {
			if(value) { // 나머지가 같지 않은 경우 count 더해줌
				count++;
			}
		}
		System.out.println(count);
    }
}