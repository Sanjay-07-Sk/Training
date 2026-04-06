package Day13;
import java.util.*;
public class Alist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,6,7,8,9));
        /*for(int i=1;i<arr.size();i++){
            if(arr.get(i)%2==0){
                arr.remove(i);
                i--;
            }
        }*/
       arr.remove(3);
       System.out.println(arr);
    }
}
