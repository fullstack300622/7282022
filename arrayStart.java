import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        //
//        System.out.println("please enter size of array");
//        int arraySize = s.nextInt();

        String[] arrayNames = new String[10];


        System.out.println("Size of array is: " + arrayNames.length);


        for (int i = 0; i < arrayNames.length; i++) {
            System.out.println("please enter student in index " + i);
            arrayNames[i] = s.nextLine();
        }

        for (int i = 0; i < arrayNames.length; i++) {
            String name = arrayNames[i];
            System.out.println(name);
        }

        System.out.println("End of process");

//        int[] arrayInt = {5, 3, 6 , 123};
//        String[] classNames = {"Beni", "Levi", "Oren"};
//        for (int i = 0; i < arrayInt.length; i++) {
//            System.out.println(arrayInt[i]);
//        }


//        int[] arrayInt = new int[5];
//
//        arrayInt[0] = 12;
//        arrayInt[2] = 8;
//
//        for (int i = 0; i <arrayInt.length; i++) {
//            System.out.println(arrayInt[i]);
//        }

//        System.out.println(arrayInt.length);
//        String myString= Arrays.toString(arrayInt);

        //    Write a program that get 10 names from user (Use Array and loop)
//        String [] arrayNames = new String[10];


    }
}
