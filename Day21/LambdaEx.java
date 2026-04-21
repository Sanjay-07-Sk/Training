package Day21;
@FunctionalInterface
interface Math {
    int calc(int a, int b);
}
@FunctionalInterface
interface Exercise {
    void sayhello();
}
public class LambdaEx {
    public static void main(String[] args) {
        /*Math m=new Math() {
            @Override
            public int add(int a,int b) {
                return a+b;
            }
        };*/
        /*
        Math m=(a,b)->{
            System.out.println("Adding two numbers");
            return a+b;
        };   
         */
        Math m=(a,b)->a+b; // Lambda expression
        Math m1=(a,b)->a*b; // Lambda expression for multiplication
        System.out.println(m.calc(5, 10));
        System.out.println(m1.calc(5, 10));
        Exercise e=()->System.out.println("Hello, World!"); // Lambda expression for sayhello method
        e.sayhello();
    }
}
