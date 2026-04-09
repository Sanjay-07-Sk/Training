package Day15;
import java.util.*;

public class Overlap {
    static List<List<Integer>> overlap(List<List<Integer>> interval){
        List<List<Integer>> res=new ArrayList<>();
        Collections.sort(interval,(a,b)->a.get(0)-b.get(0));
        int start=interval.get(0).get(0);
        int end=interval.get(0).get(1);
        for(int i=1;i<interval.size();i++){
            if(end>=interval.get(i).get(0)){
                end=Math.max(end, interval.get(i).get(1));
            }else{
                res.add(Arrays.asList(start,end));
                start=interval.get(i).get(0);
                end=interval.get(i).get(1);
            }
        }
        res.add(Arrays.asList(start,end));
        return res;
    }
    public static void main(String[] args) {
        System.out.println(overlap(Arrays.asList(Arrays.asList(1,3), Arrays.asList(8,10), Arrays.asList(2,5), Arrays.asList(15,18))));
    }
}
