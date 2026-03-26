class Solution1221 {
    public int balancedStringSplit(String s) {
        int l=0,r=0;
        int idx=0;
        int count=0;
        while(idx<s.length()){
            if(s.charAt(idx)=='L')l++;
            else r++;
            if(l==r){
                count++;
                l=0;
                r=0;
            }
            idx++;
        }
        return count;
    }
}