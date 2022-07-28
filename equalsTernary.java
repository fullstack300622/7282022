import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Compare strings
        
//        //.equals
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your name twice");
//        String nameOne= s.nextLine();
//        String nameTwo= s.nextLine();
//        if (nameOne.equals(nameTwo)) { // 
//            System.out.println("Equals");
//        }else {
//            System.out.println("Not equals");
//        }


        //ternary operator
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number ");
        int x = scanner.nextInt();

        int y = x > 10 ? 30 : 1;

        System.out.println(y);


//        int y;
//        if (x > 10) {
//            y = 30;
//        } else {
//            y = 1;
//        }


    }

}
