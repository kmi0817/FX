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

    /* 거래 등록 */
    public void registerDeal(int amount, double exchangeRate, String currency, String detail) {
        System.out.println("Dealer: registerDeal");
    }

    /* 거래 승인 */
    public int getPositionLimits() {
        return this.positionLimits;
    }

    /* position limits 조정 */
    public void setPositionLimits(int positionLimits) {
        this.positionLimits = positionLimits;
    }
}
