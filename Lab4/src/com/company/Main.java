package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Weather weather = new Weather("Sunny", "clear-day", 23, 24, 32);
        String fileName = serializer(weather);
        deserializer(fileName);
    }

    private static String serializer(Weather weather){

        String fileName = "weather.dat";
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            oos.writeObject(weather);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return fileName;

    }

    private static void deserializer(String fileName){

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)))
        {
            Weather weather = (Weather) ois.readObject();
            System.out.printf(" Sky is " + weather.getSummary() + "\n " +
                    "Icon name: " + weather.getIcon() + " \n " +
                    "Temperature = " + weather.getTemperature() + " degrees \n " +
                    "Apparent as " + weather.getApparentTemperature() + " degrees \n " +
                    "Humidity = " + weather.getHumidity() );

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
