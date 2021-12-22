/*

N*N
Q: 4
A: 1    2   3   4
   2    4   6   8
   3    6   9   12
   4    8   12  16

*/
// @author: Oudone PKL



import java.util.Scanner;

public class ArrayTest1 {
    
    // For get and show data by array 2D
    public static void checkArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        // Variables
        int num = sc.nextInt();
        int[][] table = new int[num][num];

        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                table[row][col] = (row + 1) * (col + 1);
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        // call the method
        checkArray();
    }
}
