package pl.javastart.springintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pl.javastart.springintro.printer.TemperaturePrinter;

import java.util.Random;

@ComponentScan
@Configuration
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TemperaturePrinter printer1 = context.getBean(TemperaturePrinter.class);
        printer1.printTemperature();
    }

    @Bean
    public Random random() {
        return new Random() {
            @Override
            public int nextInt(int a) {
                return 0;
            }
        };
    }
}
