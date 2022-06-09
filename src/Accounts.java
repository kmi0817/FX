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
    public BankPaper makeBankPaper(Deal deal, String bankName) {
        System.out.println("Accounts: makeBankPaper");

        if (deal.isConfirmed() != null && deal.isChecked() != null) {
            BankPaper bankPaper = new BankPaper(deal, bankName, this);
            return bankPaper;
        } else {
            System.out.println("은행 서류 생성 불가: 승인이나 검토가 진행되지 않음");
            return null;
        }
    }

    /* 은행 거래 기록 */
    public void recordCertificate(Certificate certificate, String bankDealDate, String billSettlementDate) {
        System.out.println("Accounts: recordCertificate");
        
        certificate.setBankDealDate(bankDealDate); // 은행거래일 설정
        certificate.setBillSettlementDate(billSettlementDate); // 어음결제일 설정
    }
}
