public class Main {
    public static void main(String[] args) {
        Counterparty counterparty = new Counterparty("James", 500, "1234-5678");
        Dealer aDealer = new Dealer("Park", 300);
        Settlements settlements = new Settlements();
        settlements.registerDealer(aDealer); // Dealer는 Settlements 부서 소속 사원
        Accounts accounts = new Accounts();

        Deal aDeal = aDealer.registerDeal(counterparty,350, 1.5, "USD", "2022-08-17", "None"); // 거래 등록
        Certificate aCertificate = settlements.confirmDeal(aDeal); // 승인 불가
        System.out.println(aDeal.toString());

        settlements.adjustPositionLimits(aDealer, 400); // position limits 조정
        aCertificate = settlements.confirmDeal(aDeal); // 승인 완료
        System.out.println(aDeal.toString());
        System.out.println(aCertificate.toString());

        accounts.checkDeal(aDeal); // 거래 검토 완료
        System.out.println(aDeal.toString());

        BankPaper aBankPaper = accounts.makeBankPaper(aDeal, "단국은행"); // 은행 서류 생성
        System.out.println(aBankPaper.toString());

        accounts.recordCertificate(aCertificate, "2022-06-09", "2022-07-01");
    }
}
