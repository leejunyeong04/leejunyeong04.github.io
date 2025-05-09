import java.util.Scanner;
import java.util.Random;

public class Ljy20230628_Mid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Choose: Scissors(0), Rock(1), Paper(2): ");
        int user = scanner.nextInt();
        int computer = random.nextInt(3);

        System.out.println("You chose: " + toHand(user));
        System.out.println("Computer chose: " + toHand(computer));

        switch (user) {
            case 0: // Scissors
                switch (computer) {
                    case 0: System.out.println("Draw!"); break;
                    case 1: System.out.println("Computer wins!"); break;
                    case 2: System.out.println("You win!"); break;
                }
                break;
            case 1: // Rock
                switch (computer) {
                    case 0: System.out.println("You win!"); break;
                    case 1: System.out.println("Draw!"); break;
                    case 2: System.out.println("Computer wins!"); break;
                }
                break;
            case 2: // Paper
                switch (computer) {
                    case 0: System.out.println("Computer wins!"); break;
                    case 1: System.out.println("You win!"); break;
                    case 2: System.out.println("Draw!"); break;
                }
                break;
            default:
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
        }
    }

    public static String toHand(int n) {
        switch (n) {
            case 0: return "Scissors";
            case 1: return "Rock";
            case 2: return "Paper";
            default: return "Unknown";
        }
    }
}
