package pacote;

public class EX_14 {

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a primeira nota (peso 2): ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota (peso 3): ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota (peso 5): ");
	        double nota3 = scanner.nextDouble();

	        // Calcula a média final ponderada
	        double mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

	        System.out.println("A média final do aluno é: " + mediaFinal);

	        scanner.close();
	    }
	}

	
}
