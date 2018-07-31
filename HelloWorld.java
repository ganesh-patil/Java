import java.util.Scanner;

public class HelloWorld {
    String[] str = {"abc","xyz"};
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.str[0]);
        hw.sumMatrix();

    }

    public void sumMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int n = sc.nextInt();
        System.out.println("Number is"+ n);
        //int[][] arr = new int[n][n];
        int mainSum =0;
        int subSum = 0;
       // int[][] arr ={{1,2},{3,4}};
        int[][] arr ={{1,1,1},{2,2,2},{3,3,3}};
        int length= arr.length;
        for(int i=0;i< length;i++) {
            for (int j=0;j<length;j++){
                if(i ==j){
                    mainSum += arr[i][j];
                }
                if(j == length-i-1){
                    subSum += arr[i][j];
                }
            }

        }
        System.out.println("Main sum is"+ mainSum);
        System.out.println("Subsum is"+ subSum);

    }
}
