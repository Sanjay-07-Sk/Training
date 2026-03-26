class Solution58 {
    public int lengthOfLastWord(String s) {
        int c = 0;
        s = s.trim();
        char[] a = s.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != ' ')
                c++;
            else
                break;

        }
        return c;
    }
}