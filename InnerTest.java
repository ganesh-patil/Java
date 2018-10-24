class OuterTest{
     int outvar1 = 1;
     static int outVarStat1 = 11;

     class InnerClass{
          int innerVar1= 2;
          // static int innerVarStat1 = 22;

         public void printOuter(){
             System.out.println("ic.outvar1 "+ outvar1  );
             System.out.println("ic.outVarStat1 "+ outVarStat1 );
         }
     }

     static class StaticInner{
         int inner2Var1 = 3;
         static int innerVarStat1 = 33;
         public void printOuter(){
             System.out.println("is.outVarStat1 "+ outVarStat1 );
         }
     }

     public static void main(String[] args) {
       OuterTest ot = new OuterTest();
       System.out.println("outvar1 "+ ot.outvar1  );

       //  System.out.println("outvar1 "+ outvar1  );
       OuterTest.InnerClass ic = ot.new InnerClass();
       System.out.println("innerVar1 "+ ic.innerVar1  );

       ic.printOuter();

        // for static 
       OuterTest.StaticInner si = new OuterTest.StaticInner();
       si.printOuter();
       
 
     }
 

}