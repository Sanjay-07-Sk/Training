import java.util.Scanner;

public class Pattern3{
    public static void main(String[] args) {
        int count=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            for(int k=1;k<=count;k++){
                System.out.print("*");
            }
            count+=2;
            System.out.println();
        }
    }
}