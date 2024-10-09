package practice.pack.temperature;

import java.util.Arrays;

public class Termostat {

    private double[] temps;

    public double[] getTemps() {
        return temps;
    }

    public Termostat(double[] temps){
        this.temps = temps;
    }

    public String tempsToString(){
        String tempsToString = Arrays.toString(getTemps());
        return String.format("Le temperature degli utlimi 10 giorni sono: %s %nLa media delle temperature e': %f %nLa temperatura massima e': %f %nLa minima e': %f %nNumer giorni sopra la media: %d", tempsToString,calculateAverageTemp(),findHighestTemp(),findLowestTemp(),daysAboveAverage());
    }

    public double calculateAverageTemp(){
        double sum = 0;
        for (int i = 0; i<temps.length; i++){
            sum += temps[i];
        }
        return sum / temps.length;
    }

    public double findHighestTemp(){
        double max = 0;
        for (int i = 0; i < temps.length; i++) {
            if (max < temps[i]) {
                max = temps[i];
            }
        }
        return max;
    }

    public double findLowestTemp(){
        double min = temps[0];
        for (int i = 0; i < temps.length; i++) {
            if (min > temps[i]) {
                min = temps[i];
            }
        }
        return min;
    }

    public int daysAboveAverage(){
        int counter = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i]>calculateAverageTemp()){
                counter++;
            }
        }
        return counter;
    }

}
