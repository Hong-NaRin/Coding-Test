class Solution {
    public int solution(int n, String control) {
        
        String[] c = control.split("");
        
        for(int i = 0; i < c.length; i++) {
            
            if(c[i].equals("w")) {
                n += 1;
            }
            else if(c[i].equals("s")) {
                n -= 1;
            }
            else if(c[i].equals("d")) {
                n += 10;
            }
            else if(c[i].equals("a")) {
                n -= 10;
            }
        }
        return n;
        
        // for(int i = 0; i < control.length(); i++) {
        //     if(control.charAt(i) == 'w') {
        //         n += 1;
        //     }
        //     else if(control.charAt(i) == 's') {
        //         n -= 1;
        //     }
        //     else if(control.charAt(i) == 'd') {
        //         n += 10;
        //     }
        //     else if(control.charAt(i) == 'a') {
        //         n -= 10;
        //     }
        // }
        // return n;
    }
}