import java.util.Scanner;
public class Bai63 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n, k = 0;
    System.out.printf("\n\nInput n: ");
    n = myObj.nextInt();
    for (int i = 1; i <= n; ++i, k = 0) {
      for (int space = 1; space <= n - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
      myObj.close();
    }
  }
}