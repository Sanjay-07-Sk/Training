package Day7;
import java.util.*;

public class Test1 {
    public static int Word(String s){
    int count=0;
    int i=0;
    for (i = 0; i < s.length()-1; i++) {
        if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) && s.charAt(i+1)==' ')count++;
    }
    if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))count++;
    return count;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Word(s));
    }
}
