package weather;

public class WeatherTracker {
    String currentConditions;
    WeatherAlerter phoneAlerter;
    WeatherAlerter emailAlerter;

    public WeatherTracker() {
        this(new Phone(), new Email());
    }

    public WeatherTracker(WeatherAlerter phoneAlerter, WeatherAlerter emailAlerter) {
        this.phoneAlerter = phoneAlerter;
        this.emailAlerter = emailAlerter;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phoneAlerter.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailAlerter.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}