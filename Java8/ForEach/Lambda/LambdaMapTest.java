package Java8.ForEach.Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaMapTest {
    class Employee{

        public String desigNation;
        public String name;

        public Employee(String desigNation, String name) {
            this.desigNation = desigNation;
            this.name = name;
        }

        public String getDesigNation() {
            return desigNation;
        }

        public void setDesigNation(String desigNation) {
            this.desigNation = desigNation;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main( String[] args){
        LambdaMapTest e1 = new LambdaMapTest();
        List<Employee> elist = new ArrayList<Employee>();
        elist.add(e1.new Employee("Manager", "MName1"));
        elist.add(e1.new Employee("Manager", "MNam2"));
        elist.add(e1.new Employee("Developer", "Dname1"));
        elist.add(e1.new Employee("Developer", "Dname2"));
        elist.add(e1.new Employee("CEO", "ceo"));
        System.out.println(elist);
        Map<String, List<Employee>> mapData = new HashMap<String, List<Employee>>();
        elist.forEach((entry)->{
            List<Employee> desgnData;
            if(!mapData.containsKey(entry.getDesigNation())){
                desgnData  = new ArrayList<Employee>();
            }
            else{
                desgnData = mapData.get(entry.getDesigNation());
            }
            desgnData.add(entry);
            mapData.put(entry.getDesigNation(), desgnData);
        });

        System.out.println(mapData);

       /* Map<String, List<Employee>> result1 = elist.stream().collect(
                Collectors.toMap(Employee::getDesigNation, new ArrayList<Employee>(),
                        (oldValue, newValue) -> oldValue
                )
        );*/

       Map<String, List<Employee>> map = elist.stream().collect(Collectors.groupingBy(Employee::getDesigNation));

       System.out.println(map);


    }
}
