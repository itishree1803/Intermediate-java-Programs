import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        
        String[] choices = {"Stone", "Paper", "Scissor"};
        
        while(true) {
            System.out.println("Enter 1 for Stone, 2 for Paper and 3 for Scissor : ");
            int userChoice = sc.nextInt();
            
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Oops! That\’s not a valid choice. Try again with 1, 2, or 3.");
                continue;
            }
            
            userChoice -= 1;
            int computerChoice = ra.nextInt(3);
            
            System.out.println("You chose " + choices[userChoice] + ".");
            System.out.println("Computer chose " + choices[computerChoice] + ".");
            
            if (userChoice == computerChoice) {
                System.out.println("We both chose the same! It's a tie!");
            }
            else if (userChoice == 0 && computerChoice == 2) {
                System.out.println("Well done! You beat the computer!");
            }
            else if (userChoice == 1 && computerChoice == 0) {
                System.out.println("Well done! You beat the computer!");
            }
            else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("Well done! You beat the computer!");
            }
            else {
                System.out.println("Computer wins! Better luck next time!");
            }
            
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = sc.next();
            
            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing! See you next time!");
                break;
            }
            
            }
            sc.close(); 
        }
    }
