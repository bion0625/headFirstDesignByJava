package ch02;

public class HeatIndexDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        double heatindex = 16.923 + 1.85212 * 0.1 * temperature + 5.37941 * humidity - 1.00254 * 0.1 * temperature * humidity +
                9.41695 * 0.001 * temperature * temperature + 7.28898 * 0.001 * humidity * humidity + 3.45372 * 0.0001 * temperature * temperature * humidity - 8.14971
                * 0.0001 * temperature * humidity * humidity + 1.02102 * 0.00001 * temperature * temperature * humidity * humidity - 3.8646 * 0.00001 * temperature * temperature * temperature + 2.91583 *
                0.00001 * humidity * humidity * humidity + 1.42721 * 0.000001 * temperature * temperature * temperature * humidity + 1.97483 * 0.0000001 * temperature * humidity * humidity * humidity - 2.18429 *
                0.00000001 * temperature * temperature * temperature * humidity * humidity + 8.43296 * 0.0000000001 * temperature * temperature * humidity * humidity * humidity - 4.81975 * 0.00000000001 * temperature * temperature * temperature * humidity * humidity * humidity;
        System.out.println("체감 온도: " + heatindex);
    }
}
