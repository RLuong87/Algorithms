package com.company;

public class Main {

    public static void main(String[] args) {

        Mouse1 m1 = new Mouse1();
        m1.leftClick();
        m1.rightClick();
        System.out.println(m1.texture);
        m1.scrollDown();
        m1.scrollUp();

        Mouse2 m2 = new Mouse2();
        m2.connectBluetooth();

    }
}
