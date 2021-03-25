import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(generate(num));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            if(result.size() == 0){
                List<Integer> firstRow = new ArrayList<Integer>();
                firstRow.add(1);
                result.add(firstRow);
            }
            if(result.size() ==1){
                List<Integer> secondRow = new ArrayList<Integer>();
                secondRow.add(1);
                secondRow.add(1);
                result.add(secondRow);
            }
            if(result.size() >=1){
                List<Integer> remainingRows = new ArrayList<Integer>();
                List<Integer> oldData = result.get(result.size()-1);
                remainingRows.add(1);
                for(int j = 1 ; j<oldData.size() ; j++){
                      int a = oldData.get(j) + oldData.get(j-1);
                      remainingRows.add(a);
                }
                remainingRows.add(1);
                result.add(remainingRows);
            }

        }
        return result;
    }
}
