public class Counterparty {
    private String name;
    private int positionLimits;
    private String contactInfo;

    Counterparty(String name, int positionLimits, String contactInfo) {
        this.name = name;
        this.positionLimits = positionLimits;
        this.contactInfo = contactInfo;
    }

    public void makeContact() {
        System.out.println("Counterparty: 연락");
    }
}
