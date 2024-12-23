
//Print patterns :

public class Patterns {
  public static void main(String[] args) {
    pattern6();
  }

  /*
  
  *****
  *****
  *****
  *****
  *****
  
  */
  static void pattern1() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /*
  
  *
  **
  ***
  ****
  *****
  
  */
  static void pattern2() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /*
  
  *****
  ****
  ***
  **
  *
  
  */
  static void pattern3() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 6 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /*
   * 
   * 1
   * 1 2
   * 1 2 3
   * 1 2 3 4
   * 1 2 3 4 5
   * 
   */
  static void pattern4() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  /*
  
  *
  **
  ***
  ****
  *****
  ****
  ***
  **
  *
  
  */
  static void pattern5() {
    for (int i = 1; i <= 9; i++) {
      if (i < 6) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
      } else {
        for (int j = 1; j <= 10 - i; j++) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }

  static void pattern6() {
    for (int i = 1; i <= 9; i++) {
      int totalColsinRow = i > 5 ? 10 - i : i;
      int spaces = 5 - totalColsinRow;
      for (int s = 0; s < spaces; s++) {
        System.out.print(" ");
      }
      if (i <= 5) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*" + " ");
        }
      } else {
        for (int j = 1; j <= 10 - i; j++) {
          System.out.print("*" + " ");
        }
      }
      System.out.println();
    }
  }
}
