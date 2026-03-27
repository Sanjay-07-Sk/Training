package Day7;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        int space = s.length() - 2;
        int j = s.length() - 1;
        int stind = 0;
        for (i = 0; i <= s.length() / 2; i++) {
            System.out.print(s.charAt(stind));
            stind++;
            for (int k = 1; k < space; k++) {
                System.out.print(" ");
            }
            space--;

            System.out.println(s.charAt(j));
            j--;
        }
        space = 1;
        for (i = s.length() / 2; i < s.length() - 1; i++) {
            System.out.print(s.charAt(stind));
            stind++;
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            space++;

            System.out.println(s.charAt(j));
            j--;
        }
    }
}
