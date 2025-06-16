import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	
    public static void main(String[] args) throws IOException {
		
    	// 백준 - 알파벳 찾기 10809번
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine(); //알파벳 소문자로만 이루어진 단어 S
    	
    	//출력
    	for(int i=0; i<26; i++) { //a~z
    		char ch = (char) ('a' + i);
    		int index = s.indexOf(ch);
    		System.out.print(index + " ");
    	}
    }
}