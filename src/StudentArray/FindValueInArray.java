package StudentArray;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] student = {"Quan", "Thuy", "Long", "Hoang", "Huy"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name student: ");
        String input_name = sc.nextLine();

        boolean check = false;
        for (int i=0; i<student.length;i++){
            if(student[i].equals(input_name)){
                System.out.println("Position of student name " + (input_name) + " in the list: " + (i+1));
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Not found student name " + (input_name) + " in the list");
        }
    }
}
