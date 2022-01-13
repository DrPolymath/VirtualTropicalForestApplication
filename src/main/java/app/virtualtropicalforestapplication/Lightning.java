package app.virtualtropicalforestapplication;

public class Lightning extends WeatherDecorator {

    public Lightning(Weather weather) {
        this.weather = weather;
    }

    public String getDesc() {
        return weather.getDesc() + ", Lightning";
    }

}
