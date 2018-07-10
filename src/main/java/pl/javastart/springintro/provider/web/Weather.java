package pl.javastart.springintro.provider.web;

public class Weather {

    private MainWeather main;

    public MainWeather getMain() {
        return main;
    }

    public void setMain(MainWeather main) {
        this.main = main;
    }

    public static class MainWeather {
        private int temp;

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }
    }

}
