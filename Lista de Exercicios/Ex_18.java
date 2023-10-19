package pacote;

public class Ex_18 {
	
	    public static void main(String[] args) {
	    	
	    }
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a nota da 1ª avaliação: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a nota da 2ª avaliação: ");
	        double nota2 = scanner.nextDouble();

	        // Calcula a média aritmética simples
	        double media = (nota1 + nota2) / 2;

	        System.out.println("A média do aluno é: " + media);

	        if (media >= 6.0) {
	            System.out.println("Aluno APROVADO!");
	        } else {
	            System.out.println("Aluno REPROVADO!");
	        }

	        scanner.close();
	    }
	

}
