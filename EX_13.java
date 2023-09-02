package pacote;

public class EX_13 {
	
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a temperatura em graus Fahrenheit: ");
	        double temperaturaFahrenheit = scanner.nextDouble();

	        // Calcula a temperatura em graus Celsius
	        double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;

	        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);

	        scanner.close();
	    }
	

}
