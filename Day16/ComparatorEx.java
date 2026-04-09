package Day16;
import java.util.*;
class Student1{
    int id;
    String name;
    int marks;
    public Student1(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return id+":"+name+":"+marks;
    }
}
public class ComparatorEx {
    public static void main(String[] args) {
        List<Student1> students=new ArrayList<>();
        students.add(new Student1(1, "A", 90));
        students.add(new Student1(2, "B", 80));
        students.add(new Student1(5, "E", 85));
        students.add(new Student1(4, "D", 90));
        Comparator<Student1> byId=new Comparator<Student1>() {
            public int compare(Student1 a, Student1 b) {
                return a.id-b.id;
            }
        };
        Collections.sort(students, byId);
        System.out.println("Sorted by ID: " + students);
        Collections.sort(students, (a,b)->a.marks-b.marks);
        System.out.println("Sorted by marks: " + students);
    }
}
