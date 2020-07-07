package BTT_CountOfStudentPass;

import java.util.Scanner;

public class CountOfStudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of student: ");
        int size = sc.nextInt();


        int[] array;
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter point of student " + i + "  :");
            array[i] = sc.nextInt();
            i++;
        }


        System.out.printf("%-20s%s%s", "List of point: ", "","\n");
        int count = 0;
        for (int j=0; j < array.length; j++){
            System.out.print(array[j] + "\t");
            if(array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of student pass: " + count);
    }
}
