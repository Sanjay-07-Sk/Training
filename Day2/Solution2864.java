class Solution2864 {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<count;i++){
            ans.append('1');
        }
        for(int i=count;i<s.length();i++){
            ans.append('0');
        }
        ans.append('1');
        return ans.toString();
    }
}