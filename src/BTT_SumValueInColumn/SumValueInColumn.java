package BTT_SumValueInColumn;

import java.util.Scanner;

public class SumValueInColumn {
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


        System.out.println("Enter column want sum: ");
        int col = sc.nextInt();

        if(col > cols){
            System.out.println("Column not in array");
        }else{
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][col-1];
            }
            System.out.println("Sum of column " + col + " is :" + sum);
        }
    }
}
