package app.virtualtropicalforestapplication;

public class Windy extends WeatherDecorator {

    public Windy(Weather weather) {
        this.weather = weather;
    }

     public String getDesc() {
        return weather.getDesc() + ", Windy";
     }

}
