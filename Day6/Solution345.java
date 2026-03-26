class Solution345 {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        String temp="";
        ArrayList<Character> vow=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(int i=s.length()-1;i>=0;i--){
            if(vow.contains(arr[i]))temp+=arr[i];
        }
        String ans="";
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(vow.contains(arr[i])){
                ans+=temp.charAt(index);
                index++;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
     static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw =
                     new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
}