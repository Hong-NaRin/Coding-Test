import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 백준 - 코딩은 체육과목입니다 25314번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = "long int";
		String l = "";
		for(int i = 8; i <= n; i+=4) {
			l += "long ";
		}
		System.out.println(l + str);
    }
}