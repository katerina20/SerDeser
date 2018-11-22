package com.company;

import java.io.Serializable;

public class Weather implements Serializable {

    private String summary;
    private String icon;
    private double temperature;
    private double apparentTemperature;
    private double humidity;

    public Weather(String summary, String icon, double temperature, double apparentTemperature, double humidity) {
        this.summary = summary;
        this.icon = icon;
        this.temperature = temperature;
        this.apparentTemperature = apparentTemperature;
        this.humidity = humidity;
    }

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public double getHumidity() {
        return humidity;
    }
}
