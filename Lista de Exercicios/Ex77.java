public class Ex77{
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1, 4, 2, 7, 8, 3, 6};
        
        // Primeira parte do algoritmo
        for (int i = 8; i >= 5; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }

        // Segunda parte do algoritmo
        v[3] = v[1];
        v[1] = v[v[3]];
        v[v[3]] = v[v[2]];

        // Imprime o vetor resultante
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}
