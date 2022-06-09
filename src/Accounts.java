public class Accounts {

    Accounts() {}

    public void checkDeal(Deal deal) {
        deal.makeCheck(this);
    }

    public BankPaper requestBankPaper(Deal deal, Settlements settlements) {
        BankPaper bankPaper = settlements.makeBankPaper(deal, "단국은행");

        return bankPaper;
    }
}
