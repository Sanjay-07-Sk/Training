package Day16;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student s) {
        return this.marks-s.marks;
    }
    @Override
    public String toString(){
        return name+":"+marks;
    }
}
public class ComparableMark {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("A", 90));
        list.add(new Student("B", 80));
        list.add(new Student("C", 85));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.name+":"+s.marks);
        }
        System.out.println(list);
    }
}
