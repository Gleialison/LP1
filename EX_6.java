package pacote;

public class EX_6 {
		
	public static void main (String[] args) {
		
		Exercicio6();
		
	}

			private static void Exercicio6() {
		// TODO Auto-generated method stub
		
	}

			Scanner scanner = new Scanner(System.in);
	
			System.out.print("Digite a base do retângulo: ");
			        double base = scanner.nextDouble();
	
			System.out.print("Digite a altura do retângulo: ");
			        double altura = scanner.nextDouble();
	
			        double area = base * altura;
	
			System.out.println("A área do retângulo é: " + area);
	
			        scanner.close();
	}
		
}
