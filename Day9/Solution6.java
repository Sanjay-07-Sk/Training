package Day9;
class Solution6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1 OR s.length() < numRows) return s;
        StringBuilder[] row = new StringBuilder[numRows];
        boolean down = false;
        for (int i = 0; i < numRows; i++) {
            row[i] = new StringBuilder();
        }
        int i = 0;
        for (char c: s.toCharArray()) {
            row[i].append(c);
            if (i == 0 OR i == numRows - 1) {
                down = !down;
            }
            if (down) i++;
            else i--;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder rows: row) {
            ans.append(rows);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "PAYPALISHRING";
        System.out.println(convert(s, 3));
    }
}
