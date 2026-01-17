package aufgabe_5;

import javax.swing.*;
import java.lang.reflect.Array;

public class TemperatureRecord {
    private String day;
    private double temperature;
    private String unit;

    public void setDay(String day) {
        this.day = day;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public static void findMinAndMaxTemperature(TemperatureRecord[] records){
        double min = records[0].temperature;
        double max = records[0].temperature;
        int indexMin = 0;
        int indexMax = 0;
        String [] woche = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        for(int i = 0; i < records.length; i++){
            if(records[i].temperature < min){
                min = records[i].temperature;
                indexMin = i;
            }
            if(records[i].temperature > max){
                max = records[i].temperature;
                indexMax = i;
            }
        }
        System.out.println("Die niedrigste Temperatur war am " + woche[indexMin] + " " + min);
        System.out.println("Die höchste Temperatur war am " + woche[indexMax] + " " + max);

    }


}
