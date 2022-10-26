package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.*;

class Employee{
    String name ;
    Integer salary;


    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;

    }
}

public class Emp {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Someone",40000));
        emps.add(new Employee("Suresh",20000));
        emps.add(new Employee("Harish",3000));

        emps.forEach(k-> System.out.println(k.name+":"+k.salary));
        Collections.sort(emps,new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary.compareTo(o2.salary);
            }

        });
        emps.forEach(e-> System.out.println(e.name+" "+e.salary));
   }
}
