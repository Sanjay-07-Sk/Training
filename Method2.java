public class Method2 {
    static void change(int a){
        a=10;
        System.out.println("Inside method:"+a);
    }
    public static void main(String[] args) {
        int a=50;
        change(a);
        System.out.println("Outside method:"+a);
    }
}