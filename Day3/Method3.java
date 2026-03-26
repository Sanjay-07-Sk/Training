class Student{
    int mark;
}
public class Method3 {
    static void change(Student s){
        s.mark=100;
        System.out.println("Inside method:"+s.mark);
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.mark=80;
        change(s1);
        System.out.println("Outside method:"+s1);
    }
}
