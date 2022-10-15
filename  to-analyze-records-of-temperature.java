
/**
 * URL of this problem
 * https://www.codingame.com/ide/puzzle/temperatures
 */

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("0");
        } else {
            int t;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                t = in.nextInt();
                if (Math.abs(t) < Math.abs(min) || (t == -min && t > 0))
                    min = t;
            }

            System.out.println(min);
        }
    }
}