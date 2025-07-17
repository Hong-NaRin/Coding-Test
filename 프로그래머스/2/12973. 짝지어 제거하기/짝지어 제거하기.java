import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
       Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            // 스택 비어있지 않고, 전에 문자가 현재와 같으면
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}