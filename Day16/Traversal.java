package Day16;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        /*This will throw ConcurrentModificationException
        for(int i: list){
            if(i==4){
                list.remove(i);
            }
            System.out.println(i);
        }*/
       Iterator<Integer> it=list.iterator();
       ListIterator<Integer> it1=list.listIterator();
        while(it.hasNext()){
            int i=it.next();
            if(i==4){
                it.remove();
            }
            System.out.println(i);
        }
        System.out.println(list);
        while (it1.hasPrevious()) {
            int i = it1.previous();
            System.out.println(i);
        }
    }
}
