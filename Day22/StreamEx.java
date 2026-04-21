package Day22;
import java.util.*;
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
public class StreamEx {
    public static void main(String[] args) {
        List<Integer> num=List.of(2,3,4,5,6);
        List<Integer> mulby2=num.stream().map(n->n*2).toList();
        System.out.println(num);
        System.out.println(mulby2);
        List<Integer> even=num.stream().filter(n->n%2==0).toList();
        int total=mulby2.stream().reduce(1,(a,b)->a+b);
        System.out.println(total);
        System.out.println(even);
        List<Employee> emp=List.of(new Employee("Saai", 50000), new Employee("Rohit", 25000), new Employee("Thillai", 45000));
        List<String> names=emp.stream().map(e->e.getName()).toList();
        List<Integer> salaries=emp.stream().map(e->e.getSalary()).toList(); 
        List<Integer> salarygreater30000=emp.stream().filter(n->n.getSalary()>30000).map(e->e.getSalary()).toList();
        System.out.println(names+" "+salaries);
        System.out.println("Salaries greater than 30000: " + salarygreater30000);
    }
}
