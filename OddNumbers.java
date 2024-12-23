public class OddNumbers {
  public static void main(String[] args) {
    System.out.println("Total odd numbers from 1 to 10 are :");
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        System.out.println(i + " ");
      }
    }
  }
}
