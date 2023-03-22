// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ver = sc.nextInt();
        int edg = sc.nextInt();

        int adjacencyMatrix[][] = new int[ver][ver];
        for (int i = 0; i < edg; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjacencyMatrix[v1][v2] = 1;
            adjacencyMatrix[v2][v1] = 1;
        }

        for (int i = 0; i < ver; i++) {
            for (int j = 0; j < ver; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
/**
 * CUSTOM INPUT
 * 4 5
 * 0 1
 * 0 2
 * 3 0
 * 1 3
 * 2 3
 */

/**
 * OUTPUT
 * 0 1 1 1
 * 1 0 0 1
 * 1 0 0 1
 * 1 1 1 0
 * 
 */