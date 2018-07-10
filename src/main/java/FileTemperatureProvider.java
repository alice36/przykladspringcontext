import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileTemperatureProvider {

    public int getTemperatureFromFile() {
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
