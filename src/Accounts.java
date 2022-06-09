public class Accounts {

    Accounts() {}

    /* 거래 검토 */
    public void checkDeal(Deal deal) {
//        System.out.println("Accounts: checkDeal");

        if (deal.isConfirmed() != null) {
            deal.makeCheck(this);
        } else {
            System.out.println("검토 불가: 승인되지 않은 거래");
        }
    }

    /* 은행 거래 기록 */
    public void recordCertificate(Certificate certificate, String bankName, String bankDealDate, String billSettlementDate) {
//        System.out.println("Accounts: recordCertificate");

        certificate.completeCertificate(this, bankName, bankDealDate, billSettlementDate);
    }
}