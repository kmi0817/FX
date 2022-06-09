import java.sql.Array;
import java.util.ArrayList;

public class Settlements {
    private ArrayList<Certificate> certificateList;

    Settlements() {
        certificateList = new ArrayList<Certificate>();
    }

    /* 거래 승인 */
    public void confirmDeal(Deal deal) {
        System.out.println("Settlements: confirmDeal");
    }

    /* position limits 조정 */
    public void adjustPositionLimits(Dealer dealer) {
        System.out.println("Settlements: adjustPositionLimits");
    }
}
