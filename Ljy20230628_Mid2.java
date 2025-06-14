import java.util.Scanner;
import java.util.Random;

public class Ljy20230628_Mid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attacker = -1; // 0 = user, 1 = computer

        // Step 1: Decide who gets the first attack turn
        while (attacker == -1) {
            System.out.println("Choose: Scissors(0), Rock(1), Paper(2): ");
            int user = scanner.nextInt();
            int computer = random.nextInt(3);

            System.out.println("You chose: " + toHand(user));
            System.out.println("Computer chose: " + toHand(computer));

            if (user == computer) {
                System.out.println("It's a draw! Try again.");
            } else if ((user == 0 && computer == 2) || 
                       (user == 1 && computer == 0) || 
                       (user == 2 && computer == 1)) {
                attacker = 0;
                System.out.println("You got the attack turn!");
            } else {
                attacker = 1;
                System.out.println("Computer got the attack turn!");
            }
        }

        // Step 2: MukChiBba loop
        while (true) {
            System.out.println("\nMukChiBba! Choose: Scissors(0), Rock(1), Paper(2): ");
            int user = scanner.nextInt();
            int computer = random.nextInt(3);

            System.out.println("You chose: " + toHand(user));
            System.out.println("Computer chose: " + toHand(computer));

            if (user == computer) {
                if (attacker == 0) {
                    System.out.println("You win the game!");
                } else {
                    System.out.println("Computer wins the game!");
                }
                break;
            } else {
                if ((user == 0 && computer == 2) || 
                    (user == 1 && computer == 0) || 
                    (user == 2 && computer == 1)) {
                    attacker = 0;
                    System.out.println("You take the attack!");
                } else {
                    attacker = 1;
                    System.out.println("Computer takes the attack!");
                }
            }
        }
    }

    public static String toHand(int n) {
        if (n == 0) return "Scissors";
        else if (n == 1) return "Rock";
        else if (n == 2) return "Paper";
        else return "Unknown";
    }
}
