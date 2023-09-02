package pacote;

public class EX_16 {
	
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um valor: ");
	        double valor = scanner.nextDouble();

	        if (valor >= 0) {
	            System.out.println("É POSITIVO");
	        } else {
	            System.out.println("É NEGATIVO");
	        }

	        scanner.close();
	    }
	}

