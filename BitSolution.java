import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if (N == 0 || N == 1) {
            System.out.println(1);
            System.exit(0);
        }
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= N; i++)
            res = res.multiply(new BigInteger(String.valueOf(i)));
        
        System.out.println(res.toString());
    }
}