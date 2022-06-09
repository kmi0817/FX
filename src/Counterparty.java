public class Counterparty {
    private String name;
    private int positionLimits;
    private String contactInfo;

    Counterparty(String name, int positionLimits, String contactInfo) {
        this.name = name;
        this.positionLimits = positionLimits;
        this.contactInfo = contactInfo;
    }

    public boolean makeContact(Deal deal) {
//        System.out.println("Counterparty: makeContact");

        if (this.positionLimits >= deal.getAmount()) {
            return true;
        } else {
            return false;
        }
    }
}
