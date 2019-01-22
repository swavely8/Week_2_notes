package com.swavely.Week1;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int lowTemperature = 32;

        System.out.println(true | (lowTemperature+=5)>0);
        System.out.println(lowTemperature);

        int currentTemperature = 11;
        int warmThreshold = 70;

        System.out.println(currentTemperature > warmThreshold ? "it's warm outside!":"it's cold outside!");

        String windDirection = "west";

        switch (windDirection) {
            case "north":
                System.out.println("The wind is blowing from the north");
                break;
            case "west":
                System.out.println("The wind is blowing from the west");
                break;
            case "south":
                System.out.println("The wind is blowing from the south");
                break;
            case "east":
                System.out.println("The wind is blowing from the east");
                break;
            default:
                System.out.println("IDK where the wind is blowing");
        }
        for(int i = 0; i<=10; i++){
           System.out.println(i);
        }
        String [] words = {"hello", "how","are","you"};
        for(int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }
        for(String eachWord:words){
            System.out.println(eachWord);
        }
        }
        }



