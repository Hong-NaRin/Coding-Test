class Solution {
    public int solution(int chicken) {
        int service = 0;
        
        while(chicken >= 10) {
            service += chicken / 10;
            chicken = (chicken % 10) + (chicken / 10); 
            // int coupon = chicken / 10;
            // service += coupon;
            // chicken = (chicken % 10) + coupon; 
        }
        return service;
    }
}