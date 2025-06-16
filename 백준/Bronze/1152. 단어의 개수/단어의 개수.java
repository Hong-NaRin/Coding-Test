import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 단어의 개수 1152번
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
//		String[] arr = str.trim().split(" ");
//		if(arr[0].equals("")) {
//			System.out.println(0);
//		}
//		else {
//			System.out.println(arr.length);
//		}

		StringTokenizer st = new StringTokenizer(str, " ");		
		System.out.println(st.countTokens());
    }
}