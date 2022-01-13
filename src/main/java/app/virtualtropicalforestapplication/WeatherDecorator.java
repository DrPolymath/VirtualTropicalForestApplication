package app.virtualtropicalforestapplication;

public abstract class WeatherDecorator extends Weather {
     Weather weather;
     abstract String getDesc();
}
