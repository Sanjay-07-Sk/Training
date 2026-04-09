package Day15;
import java.util.*;
public class MapEx {
    public static void main(String[] args) {
        int[] arr={7,18,45,93};
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i+1, arr[i]);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(int key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
