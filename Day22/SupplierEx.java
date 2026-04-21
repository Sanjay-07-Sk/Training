package Day22;
import java.util.function.Supplier;
import java.lang.Math;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
public class SupplierEx {
    public static void main(String[] args){
        Supplier<Integer> s=()->(int)(Math.random()*100);
        System.out.println(s.get());
        Supplier<Employee> ps=()->new Employee("Saai", 50000);
        System.out.println(ps.get().getName());
        System.out.println(ps.get().getSalary());
    }
}
