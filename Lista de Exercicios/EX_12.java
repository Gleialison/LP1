package pacote;

public class EX_12 {


	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de carros vendidos: ");
	        int numeroCarrosVendidos = scanner.nextInt();

	        System.out.print("Digite o valor total das vendas: ");
	        double valorTotalVendas = scanner.nextDouble();

	        System.out.print("Digite o salário fixo: ");
	        double salarioFixo = scanner.nextDouble();

	        System.out.print("Digite o valor por carro vendido: ");
	        double valorPorCarroVendido = scanner.nextDouble();

	        // Calcula a comissão fixa por carro
	        double comissaoFixaPorCarro = numeroCarrosVendidos * valorPorCarroVendido;

	        // Calcula a comissão de 5% sobre o valor total das vendas
	        double comissaoPorVendas = 0.05 * valorTotalVendas;

	        // Calcula o salário final do vendedor
	        double salarioFinal = salarioFixo + comissaoFixaPorCarro + comissaoPorVendas;

	        System.out.println("O salário final do vendedor é: " + salarioFinal);

	        scanner.close();
	    }
	}

