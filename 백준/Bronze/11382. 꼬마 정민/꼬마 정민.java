import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 꼬마정민 11382번
		// 10의 12제곱은 int 타입의 최댓값보다 크기 때문에 long써야
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		System.out.println(a+b+c);
    }
}