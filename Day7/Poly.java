package Day7;
class Calc{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class Poly {
    public static void main(String[] args) {
        Calc c=new Calc();
        System.out.println(c.add(29.8,31.6));
        System.out.println(c.add(96,99));
        System.out.println(c.add(7,18,45));
    }
}
