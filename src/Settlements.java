import java.sql.Array;
import java.util.ArrayList;

public class Settlements {
    private ArrayList<Certificate> certificateList;

    Settlements() {
        certificateList = new ArrayList<Certificate>();
    }

    /* 거래 승인 */
    public Certificate confirmDeal(Deal deal) {
        System.out.println("Settlements: confirmDeal");

        if (deal.contactCounterparty()) {
            Certificate certificate = deal.makeConfirmation(this);
            certificateList.add(certificate);
            return certificate;
        } else {
            System.out.println("거래 승인 불가: Counterparty의 거래 취소");
            return null;
        }
    }

    /* position limits 조정 */
    public void adjustPositionLimits(Dealer dealer) {
        System.out.println("Settlements: adjustPositionLimits");
    }
}
