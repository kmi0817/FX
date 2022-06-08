public class Main {
    public static void main(String[] args) {
        Dealer aDealer = new Dealer("Park", 400);
        Deal aDeal = aDealer.registerDeal();

        Settlements settlements = new Settlements();
        Certificate aCertificate = settlements.confirmDeal(aDeal, aDealer);
    }
}
