package pl.javastart.springintro.printer;

import org.springframework.stereotype.Component;
import pl.javastart.springintro.provider.TemperatureProvider;

@Component
public class TemperaturePrinter {

    private TemperatureProvider temperatureProvider;

    public TemperaturePrinter(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public void printTemperature() {
        int temp = temperatureProvider.getTemperature();
        System.out.println(temp);
    }

}
