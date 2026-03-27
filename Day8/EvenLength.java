package Day8;

import java.util.Scanner;

public class EvenLength {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        System.out.println(Length(s));
    }
    public static String Length(String s){
        int count=0;
        StringBuilder ans=new StringBuilder();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(count%2==0){
                    ans.append(temp);
                    ans.append(" ");
                }
                temp="";
                count=0;
            }
            else{
                count++;
                temp+=s.charAt(i);
            }
        }
        if(count%2==0){
            ans.append(temp);
        }
        return ans.toString();
    }
}
