class Solution {
    public String solution(String rsp) {
        
        String result = "";
        String[] arr = rsp.split("");
        
        
        for(int i = 0; i < arr.length; i++) {
          if(arr[i].equals("2")) {
              result += "0";
          }  
          else if(arr[i].equals("0")) {
              result += "5";
          }
          else if(arr[i].equals("5")) {
              result += "2";
          }    
        }
        return result;
    }
}