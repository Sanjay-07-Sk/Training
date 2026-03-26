class Solution520 {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(char i:word.toCharArray()){
            if(Character.isUpperCase(i))count++;
        }
        if(count==word.length() || count==0)return true;
        if(count==1 && Character.isUpperCase(word.charAt(0)))return true;
        return false;
    }
}