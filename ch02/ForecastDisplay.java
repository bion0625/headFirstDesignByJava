package ch02;

public class ForecastDisplay implements DisplayElement, Observer{

    private float lastPressure;
    private float currentPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        if (lastPressure != 0 && currentPressure > lastPressure) System.out.println("날씨가 좋아지고 있습니다.");
        else if (currentPressure < 30) System.out.println("날씨가 쌀쌀하며 비가올 것 같습니다.");
        else System.out.println("지금과 비슷할 것 같습니다.");
    }
}
