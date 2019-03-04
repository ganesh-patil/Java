package JavaLangPackageTest.EqualsMethodTest;

public class Student {
    public String name;
    public int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static  void main(String[] args){
        Student s1 = new Student("Abc", 101);
        Student s2 = new Student("Bcd", 102);
        Student s3 = new Student("Abc", 101);
        Student s4 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals("Ganesh"));
        System.out.println(s1.equals(null));

        /*
        * Output
        *   false
            true
            true
            false
            false

        * */

    }

    public boolean equals(Object obj){
        try{
            String name1 = this.name;
            int rollNo1 = this.rollNo;
            Student s = (Student)  obj;

            String name2 = s.name;
            int rollNo2 = s.rollNo;
            if(name1.equals(name2) && rollNo1 == rollNo2){
                return  true;
            }
            else{
                return false;
            }
        }
        catch (ClassCastException e) {
            return  false;
        }
        catch (NullPointerException e){
            return false;
        }

    }
}
