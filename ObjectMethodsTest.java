public class ObjectMethodsTest  {
    public static void main(String[] args)  {
     ObjectMethodsTest obj = new ObjectMethodsTest();
      //  ObjectMethodsTest obj2= (ObjectMethodsTest) obj.clone();

       String ganesh ="Name";
       char[] ga= ganesh.toCharArray();
       System.out.println(ga[0]);

    }
    public void  sample() throws InterruptedException {
        wait();
    }
   /* public ObjectMethodsTest clone(){
        System.out.println("Clone called");
//        ObjectMethodsTest obj = new ObjectMethodsTest();
        return this;
    }*/
}
