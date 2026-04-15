package Day18;
import java.util.*;
public class Arrows {
    public static int arrow(List<List<Integer>> arr){
        Collections.sort(arr,(a,b)->a.get(1)-b.get(1));
        int st=arr.get(0).get(0);
        int end=arr.get(0).get(1);
        int count=0;
        for(int i=1;i<arr.size();i++){
            if(end>=arr.get(i).get(0) && end<=arr.get(i).get(1)){
                continue;
            }
            else{
                st=arr.get(i).get(0);
                end=arr.get(i).get(1);
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        System.out.println(arrow(Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5,6),Arrays.asList(7,8))));
    }
}

