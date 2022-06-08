public class BankPaper {
    private Deal deal;
    private String bank;

    BankPaper(Deal deal, String bankName) {
        this.deal = deal;
        this.bank = bankName;
        System.out.println("은행 서류 생성");
    }
}
