import java.util.ArrayList;

public class Dealer {
    private String name;
    private int positionLimits;
    private ArrayList<Deal> myDealList;
    
    Dealer(String name, int positionLimits) {
        this.name = name;
        this.positionLimits = positionLimits;
        myDealList = new ArrayList<Deal>();
    }

    /* 거래 등록 */
    public Deal registerDeal(Counterparty counterparty, int amount, double exchangeRate, String currency, String dueTo, String detail) {
//        System.out.println("Dealer: registerDeal");

        Deal deal = new Deal(this, counterparty, amount, exchangeRate, currency, dueTo, detail);
        myDealList.add(deal);
        return deal;
    }

    /* 거래 승인 */
    public int getPositionLimits() {
        return this.positionLimits;
    }

    /* position limits 조정 */
    public void setPositionLimits(int positionLimits) {
        this.positionLimits = positionLimits;
        System.out.println("Dealer의 position limits 조정 완료");
    }
}
