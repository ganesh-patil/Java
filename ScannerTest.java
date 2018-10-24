
import java.util.Scanner;

public class ScannerTest {

  public static void main(String[] args ) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter some number");
    int number = scan.nextInt();
    System.out.println("the number is "+ number);
  }
}