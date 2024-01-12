// The "for" structure is commonly used when the number of iterations is known in advance.

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int sum = 0;

    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      sum = sum + x;
    }
    System.out.println(sum);

    sc.close();
  }
}