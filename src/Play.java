
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
class Play extends Main{
    public static void playOn(double pTotal, double cTotal){
        Betting b = new Betting();
        int playAgain;
        Scanner sc = new Scanner(System.in);
        if(pTotal >= 22){
            System.out.println("Oops! Your total is " + (int)pTotal);
            System.out.println("Sorry, you busted! the computer won...");
            b.setMoney(b.getMoney() - b.getWager());
            System.out.println("Your new total is: $" + b.getMoney());
            System.out.println(" Would you like to play again? 1 for yes, 2 for no");
            playAgain = sc.nextInt();

            if (playAgain == 1) {
                run();
            }
            else{
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
        }


        System.out.println("Your total is: " + (int)pTotal + " Would you like to hit(1), or stay(2)? ");
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
                    System.out.println("HAHA! The computer's total is: " + (int)cTotal);
                    System.out.println("The computer busted! You Win!");
                    b.setMoney(b.getMoney() + b.getWager());
                    System.out.println("Your new total is: $" + b.getMoney());
                    System.out.println("Would you like to play again?");
                    playAgain = sc.nextInt();
                    if (playAgain == 1) {
                        run();
                    }
                    else{
                        System.out.println("Thanks for playing!");
                        System.exit(0);
                    }
                } else {
                    if (pTotal > cTotal) {
                        System.out.println("Your total was: " + (int)pTotal + " The computer's total was: " + (int)cTotal);
                        b.setMoney(b.getMoney() + b.getWager());
                        System.out.println("Your new total is: $" + b.getMoney());
                        System.out.println("You won! Would you like to play again?");
                        playAgain = sc.nextInt();
                        if (playAgain == 1) {
                            run();
                        }
                        else{
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                        }
                    } else if (cTotal > pTotal) {
                        System.out.println("Your total was: " + (int)pTotal + " The computer's total was: " + (int)cTotal);
                        b.setMoney(b.getMoney() - b.getWager());
                        System.out.println("Your new total is: $" + b.getMoney());
                        System.out.println("Sorry, the computer won... Would you like to play again?");
                        playAgain = sc.nextInt();
                        if (playAgain == 1) {
                            run();
                        }
                        else{
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("Your total was: " + (int)pTotal + " The computer's total was: " + (int)cTotal);
                        b.setMoney(b.getMoney() - b.getWager());
                        System.out.println("Your new total is: $" + b.getMoney());
                        System.out.println("The dealer wins all ties. Would you like to play again?");
                        playAgain = sc.nextInt();
                        if (playAgain == 1) {
                            run();
                            System.exit(0);
                        }
                        else{
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                        }
                    }
                }

            default:
                System.out.println("Sorry. That is not a valid response.");
                playOn(pTotal, cTotal);
        }
    }

}
