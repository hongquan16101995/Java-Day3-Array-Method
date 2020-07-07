package BTT_CountAppearOfChar;

import java.util.Scanner;

public class CountAppearOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        char charac;
        System.out.println("Enter one string: ");
        string = sc.nextLine();
        System.out.println("Enter char want count: ");
        charac = sc.next().charAt(0);


        int count = 0;
        for (int i = 0;i < string.length(); i++){
            if(charac == (string.charAt(i))){
                count++;
            }
        }
        System.out.println("Count of char is: " + count);
    }
}
