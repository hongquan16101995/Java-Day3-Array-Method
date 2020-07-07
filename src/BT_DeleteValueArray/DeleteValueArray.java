package BT_DeleteValueArray;

import java.util.Scanner;

public class DeleteValueArray {
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
        System.out.println("Enter value want to delete: ");
        int value = sc.nextInt();


        int count = indexValue(array, value);
        if (count == 0){
            System.out.println("Value not found in the array!");
        }else {
            while (count > 0) {
                deleteValue(array, value);
                count--;
            }
        }


        System.out.printf("%-30s%s", "Array after delete value: ", "");
        for (int k=0; k<array.length; k++){
            System.out.print(array[k] + "\t");
        }
    }

    //phương thức xác định value có tồn tại trong array không, trả về số value tồn tại trong array
    public static int indexValue(int[] array, int value){
        int count = 0;
        for (int i=0; i < array.length; i++){
            if(value == array[i]){
                count++;
            }
        }
        return count;
    }

    //phương thức xóa value trong array
    public static void deleteValue(int[] array, int value){
        for (int i=0; i<array.length;i++){
            if(array[i] == value) {
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
    }
}
