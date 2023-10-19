import java.util.Scanner;

public class Ex78 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crie um vetor para armazenar os nomes das pessoas
        String[] nomes = new String[10];
        
        // Faça a leitura dos 10 nomes e armazene no vetor
        System.out.println("Digite os nomes das 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        // Faça a leitura do nome a ser buscado
        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();
        
        // Verifique se o nome está no vetor
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }
        
        // Exiba a mensagem apropriada
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        
        scanner.close();
    }
}
