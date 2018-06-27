
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
class Play extends Main{
    public static void playOn(double pTotal, double cTotal){
        int playAgain;
        Scanner sc = new Scanner(System.in);
        if(pTotal >= 22){
            System.out.println("Oops! Your total is " + pTotal);
            System.out.println("Sorry, you busted! the computer won...");
            System.out.println(" Would you like to play again? 1 for yes, 2 for no");
            playAgain = sc.nextInt();

            if (playAgain == 1) {
                run();
            }
        }


        System.out.println("Your total is: " + pTotal + " Would you like to hit(1), or stay(2)? ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                pTotal += Card.cardValue();
                playOn(pTotal, cTotal);

            case 2:
                while (cTotal < 16) {
                    cTotal += Card.cardValue();
                }
                if (cTotal >= 22) {
                    System.out.println("HAHA! The computer's total is: " + cTotal);
                    System.out.println("The computer busted! You Win!");
                    System.out.println("Would you like to play again?");
                    playAgain = sc.nextInt();
                    if (playAgain == 1) {
                        run();
                    }
                } else {
                    if (pTotal > cTotal) {
                        System.out.println("Your total was: " + pTotal + " The computer's total was: " + cTotal);
                        System.out.println("You won! Would you like to play again?");
                        playAgain = sc.nextInt();
                        if (playAgain == 1) {
                            run();
                        }
                    } else if (cTotal > pTotal) {
                        System.out.println("Your total was: " + pTotal + " The computer's total was: " + cTotal);
                        System.out.println("Sorry, the computer won... Would you like to play again?");
                        playAgain = sc.nextInt();
                        if (playAgain == 1) {
                            run();
                        }
                    }
                    else {
                        System.out.println("Your total was: " + pTotal + " The computer's total was: " + cTotal);
                        System.out.println("The dealer wins all ties. Would you like to play again?");
                        playAgain = sc.nextInt();
                        if (playAgain == 1) {
                            run();
                        }
                    }
                }

            default:
                System.out.println("Sorry. That is not a valid response.");
                playOn(pTotal, cTotal);
        }
    }

}
