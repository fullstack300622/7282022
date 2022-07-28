import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        //Targil
        //User must enter size of the class to enter students grades to the array
        //after this we should print avg

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter amount of students");
        int arraySize = s.nextInt();
        int[] students = new int[arraySize];
        int sum = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.print("please enter grade number: " + i + ": ");
            students[i] = s.nextInt();
        }

        for (int i = 0; i < students.length; i++) {
            sum += students[i];
        }

        float avg = sum / students.length;

        System.out.println("Avg: " + avg);

//        //print array
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }


    }
}
