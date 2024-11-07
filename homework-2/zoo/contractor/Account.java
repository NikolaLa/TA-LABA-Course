//class used for setting date in calender
package contractor;
public class Account {
    //fields
    private String dataTime;
    private int number;

    //constructor
    public Account(){

    }

    public Account(String dataTime, int number) {
        this.dataTime = dataTime;
        this.number = number;
    }

    //methode


    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
