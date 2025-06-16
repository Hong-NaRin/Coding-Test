import java.util.*;

public class Main{
	
    public static void main(String[] args) {
		
    	// 백준 - 문자열 9086번
    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	String a = scan.next();
    	String b = scan.next();
    	String c = scan.next();
    	System.out.println(a.substring(0,1)+a.substring(a.length()-1));
    	System.out.println(b.substring(0,1)+b.substring(b.length()-1));
    	System.out.println(c.substring(0,1)+c.substring(c.length()-1));
    }
}