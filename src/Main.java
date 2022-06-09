import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Counterparty counterparty = new Counterparty("James", 400, "1234-5678");
        Dealer aDealer = new Dealer("Park", 500);
        Settlements settlements = new Settlements();
        Accounts accounts = new Accounts();

        Deal aDeal = aDealer.registerDeal(counterparty,300, 1.5, "USD", "2022-08-17", "None");
    }
}
