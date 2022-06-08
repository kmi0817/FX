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

    Deal(int amount, double exchangeRate, String currency, String dueTo, String detail) {
        System.out.println("\tDeal 생성됨");
        this.id = counter++;
        this.dealDate = new Date();
        this.confirmed = false;

        // 파라미터
        this.amount = amount;
        this.exchangeRate = exchangeRate;
        this.currency = currency;
        this.dueTo = dueTo;
        this.detail = detail;
    }
}
