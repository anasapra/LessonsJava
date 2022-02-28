package Java_core.java_core_lesson_6;
import java.io.IOException;

public class Test {
    static String cityName = "Санкт-Петербург";
    static String cityID;
    static String forecastJSON;

    public static void main(String[] args) {
        AccuWeatherModel accuWeatherModel = new AccuWeatherModel();
        try {
            cityID = accuWeatherModel.searchCityByName(cityName);
            forecastJSON = accuWeatherModel.get5DayForecast(cityID);
            System.out.println("Result = " + forecastJSON);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
