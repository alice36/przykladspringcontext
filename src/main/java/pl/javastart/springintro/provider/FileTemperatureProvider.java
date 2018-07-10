package pl.javastart.springintro.provider;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileTemperatureProvider implements TemperatureProvider {

    public int getTemperature() {
        try {
            File file = new File("temp.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            return Integer.parseInt(line);
        } catch (Exception e) {
            return -255;
        }
    }

}
