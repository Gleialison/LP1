package pacote;

public class EX_11 {
	
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o custo de fábrica do carro: ");
	        double custoFabrica = scanner.nextDouble();

	        double percentualDistribuidor = 0.28; // 28%
	        double percentualImpostos = 0.45;     // 45%

	        // Calcula o custo do distribuidor e dos impostos
	        double custoDistribuidor = custoFabrica * percentualDistribuidor;
	        double custoImpostos = custoFabrica * percentualImpostos;

	        // Calcula o custo final ao consumidor
	        double custoFinalConsumidor = custoFabrica + custoDistribuidor + custoImpostos;

	        System.out.println("O custo final ao consumidor é: " + custoFinalConsumidor);

	        scanner.close();
	    }
	}


}
