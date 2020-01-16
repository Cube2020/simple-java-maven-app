package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hi Alex, Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("Test Github automatic trigger");
    }

    private final String getMessage() {
        return message;
    }

}
