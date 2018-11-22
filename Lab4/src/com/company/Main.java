package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Weather weather = new Weather("Sunny", "clear-day", 23, 24, 32);
        serializer(weather);
    }

    private static void serializer(Weather weather){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("weather.dat")))
        {

            oos.writeObject(weather);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }
}
