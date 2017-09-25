package DesignPattern.Observer;

public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        People people = new People();
        boss.addObserver(people);
        boss.setState("true");
        boss.setState("false");
    }

}
