import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 음계 2920번
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] arr = num.split(" ");
		
		String[] yes = {"1", "2", "3", "4", "5", "6", "7", "8"};
		String[] no = {"8", "7", "6", "5", "4", "3", "2", "1"};
			
		
	
		if(Arrays.equals(arr, yes)) {
			System.out.println("ascending");
		}
		else if(Arrays.equals(arr, no)) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
    }
}
