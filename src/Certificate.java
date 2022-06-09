import java.util.Date;

public class Certificate {
    private Date createDate; // 생성일
    private Deal deal;
    private Settlements settlements; // 승인인
    private Accounts accounts; // 검토인
    private String bankName; // 거래은행
    private String bankDealDate; // 은행 거래일
    private String billSettlementDate; // 어음결제일

    Certificate(Deal deal, Settlements settlements) {
        this.createDate = new Date();
        this.deal = deal;
        this.settlements = settlements;
        this.accounts = null;
        this.bankName = "";
        this.bankDealDate = "";
        this.billSettlementDate = "";
    }

    /* 거래체결증서 기록 */
    public void completeCertificate(Accounts account, String bankName, String bankDealDate, String billSettlementDate) {
        if (this.deal.isConfirmed() != null && deal.isChecked() != null) {
            this.accounts = account;
            this.bankName = bankName;
            this.bankDealDate = bankDealDate;
            this.billSettlementDate = billSettlementDate;
        } else {
            System.out.println("거래체결증서 기록 불가: 승인이나 검토가 진행되지 않음");
        }
    }

    public String toString() {
        return "<Certificate: " + this.bankName + " 제출용, 거래일 " + this.bankDealDate + ", 어음결제일 " + this.billSettlementDate + ">";
    }
}
