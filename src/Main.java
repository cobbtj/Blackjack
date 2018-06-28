import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Betting c = new Betting();
        c.setMoney(1000);
        run();
    }



    static void run() {
        Betting b = new Betting();
        Scanner sc = new Scanner(System.in);
        double cCard1 = Card.cardValue();
        double cCard2 = Card.cardValue();
        double pCard1 = Card.cardValue();
        double pCard2 = Card.cardValue();
        double pTotal = pCard1 + pCard2;
        double cTotal = cCard1 + cCard2;
        int money = b.getMoney();

        System.out.println("##Welcome to Black Jack!##");
        System.out.println("Your current money is: " + money + " How much would you like to bet on this game?");
        int wager = b.setWager(sc.nextInt());
        System.out.println("Dealing................");
        System.out.println("You are dealt two cards");
        System.out.println("Your first card has a value of: " + (int)pCard1);
        System.out.println("Your second card has a value of: " + (int)pCard2);
        System.out.println("The total of your cards is: " + (int)pTotal);
        System.out.println("The computer was dealt two cards.");
        System.out.println("The value of the first card is " + (int)cCard1);
        Play.playOn(pTotal, cTotal);

    }


}
