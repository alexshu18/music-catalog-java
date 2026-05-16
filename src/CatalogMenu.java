import java.util.InputMismatchException;
import java.util.Scanner;

public class CatalogMenu {
    public static int menu(){
        int select = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose");
        System.out.println("1 Movie");
        System.out.println("2 Song");
        System.out.println("3 Quit");

        while(select < 1 || select > 3) {
            System.out.println("enter the valid number from 1 - 3");
            try {
                select = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e){
                System.out.println("invalid number");
                input.nextLine();
            }
        }

        return select;
    }
}
