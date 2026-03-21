import java.util.Scanner;

public class Menu {
    public static int menu() {
        int select;

        Scanner input = new Scanner(System.in);
        System.out.println("Select your option: ");
        System.out.println("1 - add track");
        System.out.println("2 - find track");
        System.out.println("3 - delete track");
        System.out.println("4 - sort");
        System.out.println("5 - quit");

        select = input.nextInt();
        return select;
    }
}
