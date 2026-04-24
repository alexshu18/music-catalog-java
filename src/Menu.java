import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int menu() {
        int selection = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose");
        System.out.println("1 add");
        System.out.println("2 delete");
        System.out.println("3 sort");
        System.out.println("4 find");
        System.out.println("5 quit");

        while(selection < 1 || selection > 5) {
            System.out.println("enter the valid number from 1 - 5");
            try {
                selection = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e){
                System.out.println("invalid number");
                input.nextLine();
            }
        }

        return selection;
    }
}
