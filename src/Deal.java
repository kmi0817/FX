import java.util.Date;

public class Deal {
    static int counter = 1; // 거래 id용 클래스 변수

    int id; // 거래번호
    Date dealDate; // 거래등록일시
    int amount; // 거래금액
    double exchangeRate; // 환율
    String currency; // 거래화폐
    String dueTo; // 거래유효기간 ex) "2022-08-17"
    String detail; // 거래내용
    boolean confirmed; // 승인여부

    Certificate certificate; // 거래체결증서
    Accounts checkedBy; // 확인(검토) 여부

    Deal(int amount, double exchangeRate, String currency, String dueTo, String detail) {
        System.out.println("\tDeal 생성됨");
        this.id = counter++;
        this.dealDate = new Date();
        this.confirmed = false;
        this.certificate = null;
        this.checkedBy = null;

        // 파라미터
        this.amount = amount;
        this.exchangeRate = exchangeRate;
        this.currency = currency;
        this.dueTo = dueTo;
        this.detail = detail;
    }

    public int getAmount() {
        return this.amount;
    }

    public Certificate makeConfirmation(Settlements settlements) {
        this.confirmed = true;
        this.certificate = new Certificate(this, settlements);

        return certificate;
    }

    public void makeCheck(Accounts accounts) {
        if (this.checkedBy == null) {
            this.checkedBy = accounts;
            System.out.println("거래 확인(검토) 완료");
        } else {
            System.out.println("거래 확인(검토) 불가: 이미 검토됨");
        }
    }

    public boolean isChecked() {
        if (this.checkedBy != null) {
            return true;
        } else {
            return false;
        }
    }
}
