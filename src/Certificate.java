public class Certificate {
    private Deal deal;
    private Settlements settlements; // 승인자
    private String bankDealDate; // 은행 거래일
    private String billSettlementDate; // 어음결제일

    Certificate(Deal deal, Settlements settlements) {
        this.deal = deal;
        this.settlements = settlements;
        this.bankDealDate = "";
        this.billSettlementDate = "";
    }

    public void setBankDealDate(String date) {
        this.bankDealDate = date;
    }

    public void setBillSettlementDate(String date) {
        this.billSettlementDate = date;
    }

    public String toString() {
        return "<Certificate: createdBy " + settlements;
    }
}
