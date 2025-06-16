import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 오븐시계 2525번
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int time = scan.nextInt();
	
		hour += time / 60;
		min += time % 60;
		
		if(min >= 60) {
			hour++;
			min -= 60;
		}
		if(hour >= 24) hour %= 24;
		
		System.out.println(hour + " " + min);
    }
}