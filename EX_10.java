package pacote;

public class EX_10 {

	public static void main(String[] args) {
		
		Exercicio10();
			
		}

			private static void Exercicio10() {
		// TODO Auto-generated method stub
		
	}

			public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o salário mensal atual: ");
		        double salarioAtual = scanner.nextDouble();

		        System.out.print("Digite o percentual de reajuste: ");
		        double percentualReajuste = scanner.nextDouble();

		        // Calcula o valor do novo salário
		        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

		        System.out.println("O novo salário é: " + novoSalario);

		        scanner.close();
		    }

}
