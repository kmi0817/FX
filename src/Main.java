public class Main {
    public static void main(String[] args) {
        Counterparty counterparty = new Counterparty("James", 500, "1234-5678");
        Dealer aDealer = new Dealer("Park", 300);
        Settlements settlements = new Settlements();
        settlements.registerDealer(aDealer); // Dealer는 Settlements 부서 소속 사원
        Accounts accounts = new Accounts();

        Deal aDeal = aDealer.registerDeal(counterparty,350, 1.5, "USD", "2022-08-17", "None"); // 거래 등록
        Certificate aCertificate = settlements.confirmDeal(aDeal); // 승인 불가
        System.out.println(aDeal.toString()); // 거래 출력
        accounts.checkDeal(aDeal); // 승인 안 된 거래는 검토 불가

        settlements.adjustPositionLimits(aDealer, 400); // position limits 조정
        aCertificate = settlements.confirmDeal(aDeal); // 승인 완료 (미완인 거래체결증서)
        System.out.println(aDeal.toString()); // 거래 출력
        System.out.println(aCertificate.toString()); // 미완인 거래체결증서 출력

        accounts.checkDeal(aDeal); // 거래 검토 완료
        System.out.println(aDeal.toString()); // 거래 출력

        accounts.recordCertificate(aCertificate, "단국은행", "2022-06-09", "2022-07-01"); // 은행 거래 기록
        System.out.println(aCertificate.toString()); // 완성된 거래체결증서 출력
    }
}
