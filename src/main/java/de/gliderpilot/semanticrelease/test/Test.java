package de.gliderpilot.semanticrelease.test;

public class Test {

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }

    public static String helloWorld() {
        return hello("World!");
    }

    public static String helloAll() { return hello("everyone!"); }

    //public static String hej() { return hello("hej!"); }

    public static String hello(String who) {
        return "Hello " + who;
    }

}
