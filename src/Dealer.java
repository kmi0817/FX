import java.util.ArrayList;
import java.util.Scanner;

public class Dealer {
    private String name;
    private int positionLimits;
    private ArrayList<Deal> myDealList;
    
    Dealer(String name, int positionLimits) {
        this.name = name;
        this.positionLimits = positionLimits;
        myDealList = new ArrayList<Deal>();
    }

    public Deal registerDeal() {
        Scanner scan = new Scanner(System.in); // Scanner 생성

//        // 거래 관련 정보 입력
//        System.out.print("거래금액: ");
//        int amount = Integer.parseInt(scan.nextLine());
//        System.out.print("환율: ");
//        double exchangeRate = Double.parseDouble(scan.nextLine());
//        System.out.print("거래화폐: ");
//        String currency = scan.nextLine();
//        System.out.print("거래유효기간: ");
//        String dueTo = scan.nextLine();
//        System.out.print("거래내용: ");
//        String detail = scan.nextLine();
//
//        Deal deal = new Deal(amount, exchangeRate, currency, dueTo, detail); // 거래 생성

          Deal deal = new Deal(300, 1.5, "USD", "2022-08-17", "없음");

        myDealList.add(deal); // myDealList에 추가
        
        System.out.println("거래 등록 완료");

        return deal;
    }

    public int getPositionLimits() {
        return this.positionLimits;
    }
}
