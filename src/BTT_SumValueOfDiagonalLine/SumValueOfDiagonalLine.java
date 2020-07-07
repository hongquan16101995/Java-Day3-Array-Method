package BTT_SumValueOfDiagonalLine;

import java.util.Scanner;

public class SumValueOfDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter size array: ");
        int size = sc.nextInt();


        int[][] array = new int[size][size];
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


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j==i) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum value of diagonal line is: " + sum);
    }
}
