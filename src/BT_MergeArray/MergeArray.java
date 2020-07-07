package BT_MergeArray;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3  =new int[(arr1.length+arr2.length)];


        System.out.printf("%-20s%s", "Element arr3: ", "");
        for (int i=0;i<arr3.length; i++){
            if(i < arr1.length){
                arr3[i] = arr1[i];
            }else if(i >= arr1.length){
                arr3[i] = arr2[i - arr1.length];
            }
            System.out.print(arr3[i] + "\t");
        }

//        System.out.println("Enter size array 1: ");
//        int size1 = sc.nextInt();
//        System.out.println("Enter size array 2: ");
//        int size2 = sc.nextInt();
//
//        int[] array1 = new int[size1];
//        int i=0;
//        while (i < array1.length){
//            System.out.println("Enter element " + (i+1));
//            array1[i] = sc.nextInt();
//            i++;
//        }
//
//        int[] array2 = new int[size2];
//        while (i < array2.length){
//            System.out.println("Enter element " + (i+1));
//            array2[i] = sc.nextInt();
//            i++;
//        }
//
//        System.out.printf("%-20s%s", "Element array1", "");
//        for (int j=0; j<array1.length; j++){
//            System.out.print(array1[j] + "\t");
//        }
//        System.out.println();
//        System.out.printf("%-20s%s", "Element array2", "");
//        for (int j=0; j<array2.length; j++){
//            System.out.print(array2[j] + "\t");
//        }
   }
}
