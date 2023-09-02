package pacote;

public class Ex_17 {


	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de maçãs compradas: ");
	        int numeroDeMacas = scanner.nextInt();

	        double custoPorMaca;

	        if (numeroDeMacas < 12) {
	        	
	        }
	            custoPorMaca = 1.30; // Menos de uma dúzia
	        } else {
	            custoPorMaca = 1.00; // Pelo menos uma dúzia
	        }

	        double custoTotal = numeroDeMacas * custoPorMaca;

	        System.out.println("O custo total da compra é: R$" + custoTotal);

	        scanner.close();
	    }
	

}
