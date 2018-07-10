public class TemperaturePrinter {

    public void printTemperature() {

        FileTemperatureProvider provider = new FileTemperatureProvider();
        int temp = provider.getTemperatureFromFile();

        System.out.println(temp);
    }

}
