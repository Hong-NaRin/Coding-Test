import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] str = {"code", "date", "maximum", "remain"};
        List<int[]> list = new ArrayList<>();
        int index = 0;
        int sort = 0;  

        // ext와 sort_by에 해당하는 인덱스를 찾는다.
        for (int i = 0; i < str.length; i++) {
            if (ext.equals(str[i])) index = i;
            if (sort_by.equals(str[i])) sort = i;
        }
        final int order=sort; // sort 변수를 final로 선언

        // 조건에 맞는 데이터를 리스트에 추가한다.
        for (int i = 0; i < data.length; i++) {
            if (data[i][index] < val_ext) {
                list.add(data[i]);
            }
        }

        // 리스트를 정렬한다. Integer.compare을 사용해 안전하게 정렬
        Collections.sort(list, (o1, o2) -> Integer.compare(o1[order], o2[order]));
        return list;
    }
}