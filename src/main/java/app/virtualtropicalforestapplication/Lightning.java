package app.virtualtropicalforestapplication;

public class Lightning extends WeatherDecorator {

    Weather weather;

    public Lightning(Weather weather) {
        this.weather = weather;
    }

    public String getDesc() {
        return weather.getDesc() + ", Lightning";
    }

}
