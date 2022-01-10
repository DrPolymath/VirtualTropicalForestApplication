package app.virtualtropicalforestapplication;

public class Thunder extends WeatherDecorator {

    Weather weather;

    public Thunder(Weather weather) {
        this.weather = weather;
    }

    public String getDesc() {
        return weather.getDesc() + ", Thunder";
    }

}
