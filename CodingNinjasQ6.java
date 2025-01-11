
//ques - https://www.naukri.com/code360/problems/reverse-string-word-wise_1262348?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM

import java.util.Scanner;

public class CodingNinjasQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
    static String reverseStringWordWise(String input) {
        String[] s = input.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();

        for (int i = s.length-1; i >= 0; i--) {
            reversed.append(s[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
