import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Counterparty counterparty = new Counterparty("James", 500, "1234-5678");
        Dealer aDealer = new Dealer("Park", 300);
        Settlements settlements = new Settlements();
        Accounts accounts = new Accounts();

        Deal aDeal = aDealer.registerDeal(counterparty,350, 1.5, "USD", "2022-08-17", "None"); // 거래 등록
        Certificate aCertificate = settlements.confirmDeal(aDeal); // 승인 불가

        settlements.adjustPositionLimits(aDealer, 400); // position limits 조정
        aCertificate = settlements.confirmDeal(aDeal); // 승인 완료

        accounts.checkDeal(aDeal); // 거래 검토 완료
    }
}
