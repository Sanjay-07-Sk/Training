class Solution557 {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String ch:arr){
            StringBuilder temp=new StringBuilder(ch).reverse().append(" ");
            ans.append(temp);
        }
        return ans.toString().trim();
    }
}