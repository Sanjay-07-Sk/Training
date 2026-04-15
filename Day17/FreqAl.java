package Day17;

import java.util.*;

class Sort{
    char al;
    int freq;
    public Sort(char al,int freq){
        this.al=al;
        this.freq=freq;
    }
}
public class FreqAl {
    public static List<Character> freqSort(String s){
        char[] arr=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->{
            if(a.getValue().equals(b.getValue())){
                return a.getKey()-b.getKey();
            }
            return b.getValue()-a.getValue();
        });
        List<Character> res=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:list){
            for(int i=0;i<entry.getValue();i++){
                res.add(entry.getKey());
            }
        }
        
        /*
        Need a separate class to store character and frequency, then sort based on frequency and character.
        List<Sort> list=new ArrayList<>();
        for(char ch:map.keySet()){
            list.add(new Sort(ch,map.get(ch)));
        }
        Collections.sort(list,(a,b)->{
            if(a.freq==b.freq){
                return a.al-b.al;
            }
            return b.freq-a.freq;
        });
        List<Character> res=new ArrayList<>();
        for(Sort sort:list){
            res.add(sort.al);
        }*/
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println(freqSort(s));
        sc.close();
    }
}