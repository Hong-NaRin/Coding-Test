class Solution {
    public int[] solution(int money) {
      
        int[] coffee = new int[2];
        coffee[0] = money / 5500;
        coffee[1] = money % 5500;
        // coffee[1] = money - (coffee[0] * 5500);
        return coffee;
      
    }
}