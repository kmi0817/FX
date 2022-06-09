import java.util.Date;

public class BankPaper {
    private Date createDate;// 생성일
    private Deal deal;
    private String bankName; // 거래은행
    private Accounts accounts; // 생성자

    BankPaper(Deal deal, String bankName, Accounts accounts) {
        this.createDate = new Date();
        this.deal = deal;
        this.bankName = bankName;
        this.accounts = accounts;
    }

    public String toString() {
        return "<BankPaper: " + bankName + " 제출용, createdBy " + accounts + ">";
    }
}
