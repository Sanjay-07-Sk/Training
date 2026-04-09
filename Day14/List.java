package Day14;
import java.util.*;

class List{
    public static void main(String[] args) {
        Set<Integer> Linked=new LinkedHashSet<>();
        Set<Integer> set=new HashSet<>();
        int[] arr={5,3,9,96,25,100,45,7,2};
        for(int i:arr){
            Linked.add(i);
            set.add(i);
        }
        System.out.println(Linked);
        System.out.println(set);
    }
}