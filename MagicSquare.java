import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[][] ms = {
        {8,1,6,3,5,7,4,9,2},
        {4,3,8,9,5,1,2,7,6},
        {2,9,4,7,5,3,6,1,8},
        {6,7,2,1,5,9,8,3,4},
        {6,1,8,7,5,3,2,9,4},
        {8,3,4,1,5,9,6,7,2},
        {4,9,2,3,5,7,8,1,6},
        {2,7,6,9,5,1,4,3,8},
        };
        
        int[] input = new int[9];
        int cost = 0;
        int minCost = 100;
        Scanner in = new Scanner(System.in);
        for(int i=0; i < 9; i++){
            input[i] = in.nextInt();
        }
        for(int i=0; i<8; i++){
            for(int j=0; j<9; j++){
                cost += Math.abs(ms[i][j] - input[j]);
            }
            if (cost < minCost) minCost = cost;
            cost = 0;
        }
        System.out.println(minCost);
    }
}
