package Day21;


import java.util.function.Predicate;

class student{
    int mark;
    student(int mark){
        this.mark=mark;
    }
}

public class PredicateEx {
    public static void main(String[] args){
        Predicate<Integer> isEven = new Predicate<Integer>(){
            public boolean test(Integer n){
                return n%2==0;
            }
        };

        //Converting the same to lambda Function:
        Predicate<Integer> isEven1 =  (n)->n%2==0;

        System.out.println(isEven.test(9999));
        System.out.println(isEven1.test(12));

        //2nd Example
        Predicate<String> check = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.charAt(0) == 'a' || s.charAt(0) == 'A';
            }
        };

        System.out.println(check.test("Apple"));
        System.out.println(check.test("Saai"));

        //3rd
        Predicate<student> isPass = (s)->s.mark>=40;
        System.out.println(isPass.test(new student(5)));

        //4th
        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(isOdd.test(12));
    }
}