package inheritance;

public class TestSubClass extends TestSuperClass {

    public void overrideTest(){
        System.out.println("From Subclass");
    }

    public static void main(String[] args) {
        TestSubClass tsc = new TestSubClass();

        tsc.overrideTest();
        TestSuperClass tsup = new TestSubClass();

        tsup.overrideTest();

        tsup.superMethod();

    }
}
