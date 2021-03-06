import java.util.ArrayList;

public class Settlements {
    private ArrayList<Dealer> dealerList;
    private ArrayList<Certificate> certificateList;

    Settlements() {
        dealerList = new ArrayList<Dealer>();
        certificateList = new ArrayList<Certificate>();
    }

    public void registerDealer(Dealer dealer) {
        dealerList.add(dealer);
    }

    /* 거래 승인 */
    public Certificate confirmDeal(Deal deal) {
//        System.out.println("Settlements: confirmDeal");

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
    public void adjustPositionLimits(Dealer dealer, int positionLimits) {
//        System.out.println("Settlements: adjustPositionLimits");

        dealer.setPositionLimits(positionLimits);
    }
}
