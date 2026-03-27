package Day8;

import java.util.Scanner;

public class WaveForm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Form(s));
    }
    public static String Form(String s){
        String ans="";
        for(int i=0;i<s.length();i+=2){
            ans+=s.charAt(i);
        }
        for(int i=1;i<s.length();i+=2){
            ans+=s.charAt(i);
        }
        return ans;
    }
}
