package DesignPattern.Observer;

import java.util.Observable;

public class Boss extends Observable{
    String state;

    public void setState(String state) {
        this.setChanged();
        this.notifyObservers(state);
        this.state = state;
    }

    public String getState() {
        //this.notifyObservers();
        return state;
    }


}
