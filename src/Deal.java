import java.util.Date;

public class Deal {
    private static int counter = 1; // 거래 id용 클래스 변수

    private Deal dealer; // 등록자
    private Counterparty counterparty; // 거래상대
    private Settlements settlements; // 승인자
    private Accounts accounts; // 검토자
    private Certificate certificate; // 거래체결증서

    private int id; // 거래번호
    private Date dealDate; // 거래등록일시

    private int amount; // 거래금액
    private double exchangeRate; // 환율
    private String currency; // 거래화폐
    private String dueTo; // 거래유효기간 ex) "2022-08-17"
    private String detail; // 거래내용

    Deal(int amount, double exchangeRate, String currency, String dueTo, String detail) {
        this.dealer = null;
        this.counterparty = null;
        this.settlements = null;
        this.accounts = null;
        this.certificate = null;

        this.id = counter++;
        this.dealDate = new Date();

        this.amount = amount;
        this.exchangeRate = exchangeRate;
        this.currency = currency;
        this.dueTo = dueTo;
        this.detail = detail;
    }

    /* 거래 승인 */
    public void contactCounterparty() {
        System.out.println("Deal: contactCounterparty");
    }

    public void makeConfirmation() {
        System.out.println("Deal: makeConfirmation");
    }

    public int getAmount() {
        return this.amount;
    }

    /* 거래 검토 */
    public Settlements isConfirmed() {
        return this.settlements;
    }

    public void makeCheck() {
        System.out.println("Deal: makeCheck");
    }

    /* 은행 서류 생성 */
    public Accounts isChecked() {
        return this.accounts;
    }
}
