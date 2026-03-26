class Solution709 {
    public String toLowerCase(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                ans.append(ch+=32);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}