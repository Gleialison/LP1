package pacote;

public class EX_8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número total de eleitores: ");
	        int totalEleitores = scanner.nextInt();

	        System.out.print("Digite o número de votos brancos: ");
	        int votosBrancos = scanner.nextInt();

	        System.out.print("Digite o número de votos nulos: ");
	        int votosNulos = scanner.nextInt();

	        System.out.print("Digite o número de votos válidos: ");
	        int votosValidos = scanner.nextInt();

	        // Calcula os percentuais
	        double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
	        double percentualNulos = (votosNulos * 100.0) / totalEleitores;
	        double percentualValidos = (votosValidos * 100.0) / totalEleitores;

	        // Imprime os resultados
	        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
	        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
	        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

	        scanner.close();
	    }


}
