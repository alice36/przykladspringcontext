package pl.javastart.springintro.provider.web;

import com.google.gson.Gson;
import pl.javastart.springintro.provider.TemperatureProvider;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WebTemperatureProvider implements TemperatureProvider {

    public int getTemperature() {

        URL url = null;
        try {
            url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Wroclaw&units=metric&APPID=a1588bad042faf337e8208716a694de2");
            InputStream inputStream = url.openStream();
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

            Gson gson = new Gson();
            Weather weather = gson.fromJson(streamReader, Weather.class);

            return weather.getMain().getTemp();

        } catch (Exception e) {
            return -255;
        }
    }

}
