package conversor;
import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua temperatura em graus Celsius:");
        float celsius = teclado.nextFloat();
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;
        System.out.println("A temperatura de "+celsius+" graus Celsius equivale a "+ fahrenheit+ " grus Fahrenheit.");
        System.out.println("A temperatura de "+celsius+" graus Celsius equivale a "+ kelvin+ " grus Kelvin.");
        System.out.println("A temperatura de "+celsius+" graus Celsius equivale a "+ reaumur+ " grus Reaumur.");
        System.out.println("A temperatura de "+celsius+" graus Celsius equivale a "+ rankine+ " grus Rankine.");

    }
    
}
