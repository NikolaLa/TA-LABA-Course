package contractor;

import java.util.Date;

public class Client {
    //field
    private Date buyDate;
    private int count;

    //constructor
    Client(Date buyDate,int count){
        this.buyDate =buyDate;
        this.count = count;
    }

    //methode

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
