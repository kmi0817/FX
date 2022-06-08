import java.sql.Array;
import java.util.ArrayList;

public class Settlements {
    ArrayList<Deal> confirmedDealList;
    ArrayList<Certificate> certificateList;

    Settlements() {
        confirmedDealList = new ArrayList<Deal>();
        certificateList = new ArrayList<Certificate>();
    }

    public Certificate confirmDeal(Deal deal, Dealer dealer) {
        if (dealer.getPositionLimits() >= deal.getAmount()) {
            Certificate certificate = deal.makeConfirmation(this);

            confirmedDealList.add(deal);
            certificateList.add(certificate);

            System.out.println("승인 완료");
            return certificate;
        } else {
            System.out.println("승인 불가: 거래금액이 PositionLimits을 초과함");
            return null;
        }
    }

    public void adjustPositionLimits(Dealer dealer, int amount) {
        dealer.makeAdjustment(amount);
    }

    public BankPaper makeBankPaper(Deal deal, String bankName) {
        BankPaper bankPaper = new BankPaper(deal, bankName);

        return bankPaper;
    }
}
