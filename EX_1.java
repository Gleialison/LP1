package pacote;

public class EX_1 {

	public static void main(String[] args) {
		
		Exercicio1();
		
	}
		
		static void Exercicio1() {
			
			int a = 10;
			int b = 20;
		
			System.out.println("Valor A:" + a);
			System.out.println("Valor B:" + b);
		
			int aux = a;
			a = b;
			b = aux;
		
			System.out.println("Valor A: " + a);
			System.out.println("Valor B: " + a);
		// TODO Auto-generated method stub

	}

}
