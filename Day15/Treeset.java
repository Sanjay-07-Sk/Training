package Day15;
import java.util.*;
public class Treeset {
    public static int closest(int[] arr,int target){
        TreeSet<Integer> tree=new TreeSet<>();
        for(int i:arr){
            tree.add(i);
        }
        Integer n1=tree.ceiling(target+1);
        Integer n2=tree.floor(target+1);
        if(n1==null)return n2;
        if(n2==null)return n1;
        if(n2-target<target-n1)return n2;
        else return n1;
    }
    public static void main(String[] args) {
        int[] arr={30,15,25,27,10,20,24};
        int target=25;
        System.out.println(closest(arr,target));
    } 
}
