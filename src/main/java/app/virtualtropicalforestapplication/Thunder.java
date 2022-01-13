package app.virtualtropicalforestapplication;

public class  Thunder extends WeatherDecorator {

    public Thunder(Weather weather) {
        this.weather = weather;
    }

    public String getDesc() {
        return weather.getDesc() + ", Thunder";
    }

}
