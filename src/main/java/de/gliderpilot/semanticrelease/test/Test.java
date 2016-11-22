package de.gliderpilot.semanticrelease.test;

public class Test {

    public static void main(String[] args) {
        System.out.println(helloWorldA());
    }

    public static String helloWorldA() {
        return hello("World!");
    }

    public static String helloAll() { return hello("everyone!"); }

    //
    public static String hej() { return hello("hej man!"); }

    public static String hello(String who) {
        return "Hello " + who;
    }

}
