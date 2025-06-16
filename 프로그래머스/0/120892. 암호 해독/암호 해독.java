class Solution {
    public String solution(String cipher, int code) {
        
         String str = "";
         String[] s = cipher.split("");

         for(int i = 0; i < s.length; i++) {
             if((i+1) % code == 0) {
                 str += s[i];
             } 
         }
         return str;
        
        // String str = "";
        // char[] arr = cipher.toCharArray();
        // for(int i=0; i < arr.length; i++){
        //     if((i+1) % code == 0) {
        //         str += arr[i];
        //     }
        // }
        // return str;        
        
//      String str = "";     
//      for(int i = code-1; i < cipher.length(); i++) {
//          if((i) % code == 0)
//             str += cipher.charAt[i];
//          }       
//      }
//      return str;
    }
}