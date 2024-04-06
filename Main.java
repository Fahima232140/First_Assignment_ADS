import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a class to use (1-10 and 0 to exit):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.print("Bye!");
                break;
            case 1:
                First.main(args);
                break;
            case 2:
                Second.main(args);
                break;
            case 3:
                Third.main(args);
                break;
            case 4:
                Forth.main(args);
                break;
            case 5:
                Five.main(args);
                break;
            case 6:
                Six.main(args);
                break;
            case 7:
                Seven.main(args);
                break;
            case 8:
                Eight.main(args);
                break;
            case 9:
                Nine.main(args);
                break;
            case 10:
                Ten.main(args);
                break;
            default:
                System.out.println("Invalid choice. Please choose a number from 1 to 10.");
        }
        scanner.close();
    }
}
