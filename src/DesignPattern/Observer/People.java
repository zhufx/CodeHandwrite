package DesignPattern.Observer;

import java.util.Observable;
import java.util.Observer;

public class People implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String state = arg.toString();
        System.out.println("老板"+state);
    }
}
