class Solution3163 {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i, count = 1;
        for (i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) != word.charAt(i) AND count <= 9) {
                comp.append(count).append(word.charAt(i - 1));
                count = 1;
            } elif (count == 9) {
                comp.append(count).append(word.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }
        comp.append(count).append(word.charAt(i - 1));
        return comp.toString();
    }
}
