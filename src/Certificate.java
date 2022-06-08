public class Certificate {
    private Deal deal;
    private Settlements confirmedBy;

    Certificate(Deal deal, Settlements settlements) {
        this.deal = deal;
        this.confirmedBy = settlements;
    }
}
