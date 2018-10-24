public class InnerBlockTest {

    public static  void main(String[] args){
        int x = 0;
        {
            x++;  // this is valid
            int y= 1;
            System.out.println("x="+x+"y="+y);
        }
     //   System.out.println("x="+x+"y="+y);  // compile  time error as y is undefined
    }
}
