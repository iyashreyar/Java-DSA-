import java.util.ArrayList;

public class StringBasics {
  public static void main(String[] args) {
    // firstly adding two characters a and b
    // it will add the ASCII values of these both characters
    System.out.println('a' + 'b');
    // adding two strings a and b
    // it will concatinate
    System.out.println("a" + "b");
    // adding a character to integer
    System.out.println('a' + 3); // it will print ASCII value of 'd' coz (a + 3 = d)
    // changing ASCII value to character
    System.out.println((char) (100));
    // OR
    System.out.println((char) ('a' + 3));
    // adding a String to integer
    System.out.println("a" + 1);
    // adding string to arraylist
    System.out.println("Yash" + new ArrayList<>());

    System.out.println("Yash" + new Integer(30));

    System.out.println(new Integer(56) + " " + new ArrayList<>());
  }
}
