package TestTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class  MyCustomEmpSort implements Comparator{
    public int compare(Object obj1, Object obj2){
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;
        return e1.empName.compareTo(e2.empName);

    }
}

class Employee implements Comparable{
    public int empId;
    public String empName;

    public Employee(int id, String name){
        this.empId = id;
        this.empName = name;
    }

    public String toString(){
        return empName+"==="+empId;
    }
    public int compareTo(Object obj1){
        Employee e1 = (Employee) this;
        Employee e2 = (Employee) obj1;

        if(e1.empId < e2.empId){
            return -1;
        }
        else if(e1.empId > e2.empId) {
            return 1;
        }
        else{
            return 0;
        }
    }
}

public class EmployeeCompComp {

    public static void main(String[] args){

        TreeSet t = new TreeSet();
        t.add(new Employee(20, "ganesh"));
        t.add(new Employee(13, "Solapur"));
        t.add(new Employee(100, "Pune"));
        System.out.println(t);

        TreeSet t1 = new TreeSet(new MyCustomEmpSort());
        t1.add(new Employee(20, "ganesh"));
        t1.add(new Employee(13, "Solapur"));
        t1.add(new Employee(100, "Pune"));
        System.out.println(t1);

    }
}
