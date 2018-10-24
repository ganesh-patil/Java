/*

public class ArrayTest{
  public static void main(String[] args){
  
      int[] testArr = {1, 2 ,3, 4};
      int testArr2[] = new int[5];
      testArr2[0] = 1;
      
      for(int index=0; index<4; index++){
      
         System.out.println(testArr[index]);
         System.out.println("Test");
      }

      for(int index: testArr) {
        System.out.println(index);
      }

      String str = "Test string ";

      System.out.println(str[1]);
  }

}*/
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args){
        int arr[] = {0,1,2,3,4};
        int lastelem ;
        for(int i=0; i<= arr.length;i++){
            System.out.println(Arrays.toString(arr));
            lastelem = arr[0];
            int j;
            for(j=0; j< arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = lastelem;
        }

        for(int i=0; i<= arr.length;i++){
            System.out.println(Arrays.toString(arr));
        }


    }
}
