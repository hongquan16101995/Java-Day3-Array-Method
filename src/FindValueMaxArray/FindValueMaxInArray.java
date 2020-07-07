package FindValueMaxArray;

import java.util.Scanner;

public class FindValueMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do{
            System.out.println("Enter array size: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size does exceed 20!");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i+1));
            array[i] = sc.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Element list: ", "");
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        int max = array[0];
        int index = 1;
        for (int j=0; j<array.length; j++){
            if(array[j]>max){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property in the array is " + max + ", at position " + index);
    }
}
