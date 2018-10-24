public class FinalTest{
   public final int a; 
   FinalTest(){
       a = 10;
   }
   public static void main(String[] args){
     FinalTest obj = new FinalTest();
     obj.myMethod();

   }

    public void myMethod(){
      //  this.a = 10;
        System.out.println(a);
     //   a++;
        System.out.println(a);

    }
}