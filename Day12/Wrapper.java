package Day12;

public class Wrapper {
    public static Integer test1(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        Integer a=Integer.valueOf(7);
        Integer b=Integer.valueOf("198");//return type object(Integer)
        Integer c=Integer.parseInt("257");//return type int(int)
        int d=b;//Unboxing Integer -> int
        System.out.println(a+" "+b+" "+c+" "+d);
        System.err.println(test1("242"));
        Integer x=200;
        Integer y=200;
        System.out.println(x==y);
        System.out.println(x.equals(y));
        /*This is becuse Integer has a cache value from -128 to 127 between this range the reference is taken the same but for 200 it is greater
        than range so each x and y has different reference since == compares reference it is false so .equals is used to compare values*/
    }
}
