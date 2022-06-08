public class Main {
    public static void main(String[] args) {
        // 거래 등록
        Dealer aDealer = new Dealer("Park", 400);
        Deal aDeal = aDealer.registerDeal();

        // 거래 승인
        Settlements settlements = new Settlements();
        Certificate aCertificate = settlements.confirmDeal(aDeal, aDealer);

        // position limits 조정
        settlements.adjustPositionLimits(aDealer, 500);
    }
}
