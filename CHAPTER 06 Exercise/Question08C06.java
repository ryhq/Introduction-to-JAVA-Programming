public class Question08C06 {
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    public static void main(String[] args) {
        System.out.println("\nCelsius\tFahrenheit \t|      Celsius \t Fahrenheit");
        for (
                double celsius = 40.0, 
                fahrenheit =120.0; 
                celsius >= 31.0 &&
                fahrenheit >= 30.0; 
                celsius -= 1.0,
                fahrenheit -= 10.0
            ) {
            System.out.printf("%5.1f \t %7.1f\t|\t%5.1f \t %7.2f", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
            System.out.println();
        }
        System.out.println("");
    }
}
