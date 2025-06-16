class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("latte")) answer += 5000;
            else answer += 4500;
        }
        return answer;
        
//      int answer = 0;
//      String[] ameri = {"iceamericano", "americanoice", "americanohot", 
//                        "hotamericano","americano","anything"};
        
//      String[] latte = {"cafelatteice","icecafelatte","hotcafelatte",
//.                       "cafelattehot","cafelatte"};
        
//      for(int i = 0; i < order.length; i++) {
//          for(int j = 0; j < ameri.length; j++) {
//              if(order[i].equals(ameri[j])) answer += 4500;
//          }
//          for(int k = 0; k < latte.length; k++) {
//              if(order[i].equals(latte[k])) answer += 5000;
//          }
//      }
//      return answer;
    }
}