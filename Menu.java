import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public static int menu() {
        int select = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Select your option: ");
        System.out.println("1 - add track");
        System.out.println("2 - find track");
        System.out.println("3 - delete track");
        System.out.println("4 - sort");
        System.out.println("5 - quit");

        while (select < 1 || select > 5) {
            System.out.println("Enter the number 1-5");
            try {
                select = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number");
                input.nextLine();
            }
        }
        return select;
    }
}
