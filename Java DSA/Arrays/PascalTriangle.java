package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void algo(int n){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i>0){
                List<Integer> pre_row = triangle.get(i-1);
                for(int j=1;j<i;j++){
                    row.add(pre_row.get(j-1)+pre_row.get(j));
                }
                row.add(1);
            }
            triangle.add(row);
        }
        System.out.println(triangle.get(3));
    }

    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex +1;
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add((int)ans);

        for(int i = 1; i < n; i++){
            ans = ans * (n - i);
            ans = ans / i ;
            list.add((int)ans);
        }
        return list;
    }

    public static void main(String[] args) {
        int numsRow = 5;
        algo(numsRow);
    }
}
