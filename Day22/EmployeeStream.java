package Day22;
/*
Employee (name,dept,salary,age)(dev,hr,support)
1.filter by dept(dev)
2.salary greater than 50k
3.total salary using sum()
4.avg salary average()
5.total count of Employee using count()
 */
import java.util.*;
class Employeetask{
    String name;
    String dept;
    int salary;
    int age;
    Employeetask(String name,String dept,int salary,int age){
        this.name=name;
        this.dept=dept;         
        this.salary=salary;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }   
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
}
public class EmployeeStream {
    public static void main(String[] args) {
        List<Employeetask> emp=List.of(
            new Employeetask("Saai", "dev", 50000, 25), 
            new Employeetask("Umesh", "hr", 25000, 30), 
            new Employeetask("Thillai", "support", 45000, 28),
            new Employeetask("Siva", "dev", 60000, 27),
            new Employeetask("Bright", "hr ", 55000, 32)
        );
        List<String> devEmployees=emp.stream().filter(e->e.getDept().equals("dev")).map(Employeetask::getName).toList();
        List<String> salaryGreaterThan50k=emp.stream().filter(e->e.getSalary()>50000).map(Employeetask::getName).toList();
        int totalSalary=emp.stream().mapToInt(Employeetask::getSalary).sum();
        double avgSalary=emp.stream().mapToInt(Employeetask::getSalary).average().orElse(0.0);
        long count=emp.stream().count();
        System.out.println("Employees in dev department: " + devEmployees);
        System.out.println("Employees with salary greater than 50k: " + salaryGreaterThan50k);
        System.out.println("Total Salary: " + totalSalary); 
        System.out.println("Average Salary: " + avgSalary);
        System.out.println("Total Count of Employees: " + count);
    }
}
