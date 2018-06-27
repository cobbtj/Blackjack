import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        run();
    }

    static void run() {

        Scanner sc = new Scanner(System.in);
        double cCard1 = Card.cardValue();
        double cCard2 = Card.cardValue();
        double pCard1 = Card.cardValue();
        double pCard2 = Card.cardValue();
        double pTotal = pCard1 + pCard2;
        double cTotal = cCard1 + cCard2;

        System.out.println("##Welcome to Black Jack!##");
        System.out.println("Dealing................");
        System.out.println("You are dealt two cards");
        System.out.println("Your first card has a value of: " + pCard1);
        System.out.println("Your second card has a value of: " + pCard2);
        System.out.println("The total of your cards is: " + pTotal);
        System.out.println("The computer was dealt two cards.");
        System.out.println("The value of the first card is " + cCard1);
        Play.playOn(pTotal, cTotal);

    }


}
