package FindMinArrayByMethod;

import java.util.Scanner;

public class FindMinArrayByMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size array: ");
        int size = sc.nextInt();

        int[]arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
            i++;
        }

        int index = minValue(arr);
        System.out.println("The smallest elment in the array is: " + index);

    }

        public static int minValue(int[] array) {
            int min = array[0];
            int index = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    index = j + 1;
                }
            }
            return index;
        }
}
