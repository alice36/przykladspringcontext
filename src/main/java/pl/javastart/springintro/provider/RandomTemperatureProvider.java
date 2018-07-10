package pl.javastart.springintro.provider;

import org.springframework.stereotype.Component;
import pl.javastart.springintro.printer.TemperaturePrinter;

import java.util.Random;

@Component
public class RandomTemperatureProvider implements TemperatureProvider {

    private Random random;

    public RandomTemperatureProvider(Random random) {
        this.random = random;
    }

    public int getTemperature() {
        return random(-25, 35);
    }

    private int random(int from, int to) {
        int a = Math.abs(from);
        return random.nextInt(a + to + 1) - to;
    }

}
