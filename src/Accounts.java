public class Accounts {

    Accounts() {}

    /* 거래 검토 */
    public void checkDeal(Deal deal) {
        System.out.println("Accounts: checkDeal");

        if (deal.isConfirmed() != null) {
            deal.makeCheck(this);
        } else {
            System.out.println("검토 불가: 승인되지 않은 거래");
        }
    }

    /* 은행 서류 생성 */
    public void makeBankPaper(Deal deal) {
        System.out.println("Accounts: makeBankPaper");
    }

    /* 은행 거래 기록 */
    public void recordCertificate(Deal deal) {
        System.out.println("Accounts: recordCertificate");
    }
}
