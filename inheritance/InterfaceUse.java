package inheritance;

public class InterfaceUse implements Interface1, Interface2 {
    public static void main(String[] args) {
        InterfaceUse iu = new InterfaceUse();
        iu.method1();

    }
    
   public  void  method1(){
        System.out.println("From Method 1 of my own clas  ");
    }
}
