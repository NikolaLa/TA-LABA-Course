package contractor;

public class Seller {
    //field
    private String name;
    private Account account;
    private int payAmount;
    //construcore

    public Seller() {
    }

    public Seller(String name, Account account, int payAmount) {
        this.name = name;
        this.account = account;
        this.payAmount = payAmount;
    }
//methode


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }
}
