// Question:
// Given a natural number n. You have to find the number of digits in it and return it.

// Examples:

/* Input: n = 5534
Output: 4 
Explanation: 5534 has 4 digits
Input: n = 100273
Output: 6
Explanation: 100273 has 6 digits */

Solution:

//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
}
