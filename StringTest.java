public class StringTest {
    public static void main(String[] args){
        String s="Hope training";
        System.out.println(s.substring(5, 10));
        String[] sarr=s.split(" ");
        System.out.println(sarr.length);
        System.out.println(sarr[0]);
        s=s.replace("Hope","Pep");
        System.out.println(s);
        for(char ch:s.toCharArray()){
            System.err.println(ch+" ");
        }
        s=s.replace(" ","");
        System.out.println(s.length());
    }
}
