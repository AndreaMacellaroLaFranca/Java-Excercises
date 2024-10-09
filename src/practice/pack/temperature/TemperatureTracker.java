package practice.pack.temperature;

public class TemperatureTracker {
    public static void main(String[] args) {

        double[] temps = {33, 12, 23, 39, 34, 31, 50, 13};

        Termostat cagliariTermostat = new Termostat(temps);

        System.out.println(cagliariTermostat.tempsToString());

    }

}
