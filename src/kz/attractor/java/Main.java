package kz.attractor.java;

import kz.attractor.java.lesson44.*;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        try {
            new Lesson45Server("localhost", 9899).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
