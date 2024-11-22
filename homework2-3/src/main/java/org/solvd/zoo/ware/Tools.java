package org.solvd.zoo.ware;

public final class Tools extends BuyWare{
    //fields
    boolean stillCanBeUsed;
    //construcotr

    public Tools(boolean stillCanBeUsed) {
        this.stillCanBeUsed = stillCanBeUsed;
    }

    //methode
    public void useTool(){

    }

    public boolean isStillCanBeUsed() {
        return stillCanBeUsed;
    }

    public void setStillCanBeUsed(boolean stillCanBeUsed) {
        this.stillCanBeUsed = stillCanBeUsed;
    }
}
