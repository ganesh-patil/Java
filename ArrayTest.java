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
