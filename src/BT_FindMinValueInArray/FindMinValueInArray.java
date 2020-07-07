package BT_FindMinValueInArray;

import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row array: ");
        int row = sc.nextInt();
        System.out.println("Enter cols array: ");
        int cols = sc.nextInt();

        int[][] array = new int[row][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element " + (i) + ", " + (j));
                array[i][j] = sc.nextInt();
            }
        }

        System.out.printf("%-30s%s", "Element in the array", "");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();

        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("The largest element in the array is " + min);
    }
}
