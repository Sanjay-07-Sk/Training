package Day8;

import java.util.Scanner;

public class NonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(nonRepeat(s));
    }
    public static char nonRepeat(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                return (char)(i + 'a');
            }
        }
        return '0';
    }
}
