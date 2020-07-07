package BT_AddValueArray;

import java.util.Scanner;

public class AddValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i+1));
            array[i] = sc.nextInt();
            i++;
        }

        System.out.println("Enter value want to add: ");
        int value = sc.nextInt();
        System.out.println("Enter position of value want to add: ");
        int index = sc.nextInt();

        if (index < 0 || index > array.length-1){
            System.out.println("Not add value in the array");
        }else {
            for (int j = 0; j < array.length; j++) {
                if(j==index){
                    for (int k = array.length-1; k >= j; k--) {
                        array[k] = array[k-1];
                    }
                    array[j] = value;
                }
            }
        }

        System.out.printf("%-20s%s", "Array after add value: ", "");
        for (int h=0; h < array.length; h++){
            System.out.print(array[h] + "\t");
        }
    }
}
