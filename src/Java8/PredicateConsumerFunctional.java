package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateConsumerFunctional {

    class  Student{

        public Student(String name, int marks) {
            Name = name;
            this.marks = marks;
        }

        private String Name;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        private int marks;
    }

    public  static void main(String[] args){

        List<PredicateConsumerFunctional.Student> students = new ArrayList<PredicateConsumerFunctional.Student>();
        PredicateConsumerFunctional pcf = new PredicateConsumerFunctional();
        students.add(pcf.new Student("S1", 30));
        students.add(pcf.new Student("S2", 40));
        students.add(pcf.new Student("S3", 50));
        students.add(pcf.new Student("S4", 60));
        students.add(pcf.new Student("S5", 70));
        students.add(pcf.new Student("S6", 80));
        students.add(pcf.new Student("S7", 90));
        Predicate<Student> p = s -> s.marks > 50;
        Function<Student, String> f = s-> {
            if(s.getMarks() > 70) {
                return "Distinction";
            }
            else if (s.getMarks() > 60){
                return "First class";
            }
            else if(s.getMarks() > 50){
                return "Second class";
            }
            else
            {
                return "Fail";
            }
        };

        Consumer<Student>  c= s ->{
            System.out.println(""+s.getName()+"Grade "+f.apply(s));
        };

        students.stream().filter(p).forEach(c);
    }
}
