import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String[] hours = { "", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve" };
        String[] minutes = { "", "one minute", "two minutes", "three minutes",
                "four minutes", "five minutes", "six minutes", "seven minutes",
                "eight minutes", "nine minutes", "ten minutes",
                "eleven minutes", "twelve minutes", "thirteen minutes",
                "fourteen minutes", "quarter", "sixteen minutes",
                "seventeen minutes", "eighteen minutes", "nineteen minutes",
                "twenty minutes", "twenty one minutes", "twenty two  minutes",
                "twenty three minutes", "twenty four minutes",
                "twenty five minutes", "twenty six minutes",
                "twenty seven  minutes", "twenty eight minutes",
                "twenty nine minutes", "half" };

        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        if(M == 0)
            System.out.println(hours[H] + " o' clock");
        else
            if (M > 30) {
                H++;
                M = 60 - M;
                System.out.println(minutes[M] + " to " + hours[H]);
            } else {
                System.out.println(minutes[M] + " past " + hours[H]);
            }
    }
}
